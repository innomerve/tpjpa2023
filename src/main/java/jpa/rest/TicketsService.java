package jpa.rest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable;

import jpa.dao.TagDao;
import jpa.dao.TicketDao;
import jpa.dao.UserDao;

import jpa.domain.Discussion;
import jpa.domain.Tag;
import jpa.domain.Ticket;
import jpa.domain.User;

import jpa.dto.*;
import jpa.responses.AppResponse;

@Path("api/tickets")
@Produces(MediaType.APPLICATION_JSON)

public class TicketsService  {


	TicketDao ticketDao = new TicketDao();
	UserDao userDao = new UserDao();
	TagDao tagDao = new TagDao();


	@GET
	public List<ListTicketDto> getAll() {

		List <Ticket> tickets = ticketDao.findAll();
		List <ListTicketDto> toReturn = new ArrayList<>();
		for(Ticket ticket: tickets){
			ListTicketDto dto = new ListTicketDto();
			dto.setId(ticket.getId());
			dto.setTitle(ticket.getTitle());
			dto.setContent(ticket.getContent());
			dto.setAuthor(ticket.getAuthor().getId(), ticket.getAuthor().getName());
			dto.setNbDiscussion(ticket.getDiscussions().size());
			if (ticket.getCreatedAt() != null) dto.setCreatedAt(ticket.getCreatedAt());
			if (ticket.getClosedAt() != null) dto.setClosedAt(ticket.getClosedAt());
			for(User user:ticket.getResolvers()){
				Map<String, Object> resolver = new HashMap<>();
				resolver.put("id", user.getId());
				resolver.put("name", user.getName());
				dto.addResolver(resolver);
			}
			for(Tag tag:ticket.getTags()){
				Map<String, Object> toAddTag = new HashMap<>();
				toAddTag.put("id", tag.getId());
				toAddTag.put("label", tag.getLabel());
				dto.addTag(toAddTag);
			}
			toReturn.add(dto);
		}
		return toReturn;
	}

	@GET
	@Path("/{id}")
	public Response getById(@PathParam("id") long id) {
		Ticket ticket = ticketDao.findOne(id);
		if(ticket == null) return AppResponse.error("Ticket ayant pour " + id + " inexistant.",Response.Status.NOT_FOUND);

		TicketDto dto = new TicketDto();
		dto.setId(ticket.getId());
		dto.setTitle(ticket.getTitle());
		dto.setContent(ticket.getContent());
		dto.setAuthor(ticket.getAuthor().getId(), ticket.getAuthor().getName());
		if (ticket.getCreatedAt() != null) dto.setCreatedAt(ticket.getCreatedAt());
		if (ticket.getClosedAt() != null) dto.setClosedAt(ticket.getClosedAt());
		for(User user:ticket.getResolvers()){
			Map<String, Object> resolver = new HashMap<>();
			resolver.put("id", user.getId());
			resolver.put("name", user.getName());
			dto.addResolver(resolver);
		}
		for(Tag tag:ticket.getTags()){
			Map<String, Object> toAddTag = new HashMap<>();
			toAddTag.put("id", tag.getId());
			toAddTag.put("label", tag.getLabel());
			dto.addTag(toAddTag);
		}

		for(Discussion discussion:ticket.getDiscussions()){
			Map<String, Object> toAdd = new HashMap<>();

			Map<String, Object> author = new HashMap<>();
			author.put("id", discussion.getAuthor().getId());
			author.put("name", discussion.getAuthor().getName());

			toAdd.put("id", discussion.getId());
			toAdd.put("content", discussion.getContent());
			toAdd.put("createdAt", discussion.getCreatedAt());
			toAdd.put("author", author);

			dto.addDiscussion(toAdd);
		}
		return AppResponse.success(dto);
	}


	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	public Response create(@Valid CreateTicketDto toSave) {

		User author = userDao.findOne(toSave.getAuthorId());

		if(author == null) return AppResponse.error("Utilisateur ayant pour id " + toSave.getAuthorId() + " inexistant.",Response.Status.NOT_FOUND);

		Ticket ticket = new Ticket();
		ticket.setTitle(toSave.getTitle());
		ticket.setContent(toSave.getContent());
		ticket.setCreatedAt(LocalDateTime.now());
		ticket.setAuthor(author);

		if (toSave.getTagIds() != null){
			Set<Tag> tags = new HashSet<>();
			for(Long id:toSave.getTagIds()){
				Tag tag= tagDao.findOne(id);
				if(tag != null) ticket.addTag(tag);
			}
		}

		ticketDao.save(ticket);
		return null;
	}



	@PUT
	@Path("/{id}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response update(@PathParam("id") long id, @Valid UpdateTicketDto toUpdate) {

		Ticket ticket = ticketDao.findOne(id);

		if(ticket == null) return AppResponse.error("Ticket ayant pour id " + id + " inexistant.",Response.Status.NOT_FOUND);

		ticket.setTitle(toUpdate.getTitle());
		ticket.setContent(toUpdate.getContent());
		ticket.setClosedAt(toUpdate.getClosedAt());

		return AppResponse.success(ticketDao.update(ticket));
	}

	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") long id) {
		Ticket ticket = ticketDao.findOne(id);
		if(ticket == null) return AppResponse.error("Ticket ayant pour id" + id + " inexistant.",Response.Status.NOT_FOUND);
		ticketDao.deleteById(id);
		return AppResponse.success(null);
	}


	/*************************************** tickets/{id}/tags *************************************************************/
	@GET
	@Path("/{id}/tags")
	@Consumes({MediaType.APPLICATION_JSON})
	public Response getAllTagsByTicketId(@PathParam("id") Long id) {
		Ticket ticket = ticketDao.findOne(id);
		if(ticket == null) return AppResponse.error("Ticket ayant pour id" + id + " inexistant.",Response.Status.NOT_FOUND);
		List<Object> tags = new ArrayList<>();
		for(Tag tag:ticket.getTags()){
			Map<String, Object> toAddTag = new HashMap<>();
			toAddTag.put("id", tag.getId());
			toAddTag.put("label", tag.getLabel());
			tags.add(toAddTag);
		}
		return AppResponse.success(tags);
	}

	@POST
	@Path("/{id}/tags")
	@Consumes({MediaType.APPLICATION_JSON})
	public Response addTagToTicket(@PathParam("id") long id, @Valid AddMultipleIdsDto toSave) {

		Ticket ticket = ticketDao.findOne(id);
		if(ticket == null) return AppResponse.error("Ticket ayant pour id" + id + " inexistant.",Response.Status.NOT_FOUND);

		for (Long tagId:toSave.getIds()) {
			Tag tag = tagDao.findOne(tagId);
			if (tag != null) ticketDao.addTag(ticket, tag);
		}
		return AppResponse.success(null);
	}

	@DELETE
	@Path("/{ticketId}/tags/{tagId}")
	public Response removeTagFromTicket(@PathParam("ticketId") long ticketId, @PathParam("tagId") long tagId) {
		Ticket ticket = ticketDao.findOne(ticketId);
		if(ticket == null) return AppResponse.error("Ticket ayant pour id " + ticketId + " inexistant.",Response.Status.NOT_FOUND);

		Tag tag = tagDao.findOne(tagId);
		if(tag == null) return AppResponse.error("Tag ayant pour id " + tagId + " inexistant.",Response.Status.NOT_FOUND);

		ticketDao.removeTag(ticket,tag);
		return AppResponse.success(null);	}



	/*************************************** tickets/{id}/resolvers *************************************************************/
	@GET
	@Path("/tickets/{id}/resolvers")
	@Consumes({MediaType.APPLICATION_JSON})
	public Response getAllResolversByTicketId(@PathParam("id") Long id) {

		Ticket ticket = ticketDao.findOne(id);
		if(ticket == null) return AppResponse.error("Ticket ayant pour id " + id + " inexistant.",Response.Status.NOT_FOUND);
		List<Object> resolvers = new ArrayList<>();
		for(User resolver:ticket.getResolvers()){
			UserDto user = new UserDto(resolver.getId(), resolver.getName());
			resolvers.add(user);
		}
		return AppResponse.success(resolvers);
	}

	@POST
	@Path("/{id}/resolvers")
	@Consumes({MediaType.APPLICATION_JSON})
	public Response addResolverToTicket(@PathParam("id") long id, @Valid AddMultipleIdsDto toSave) {
		Ticket ticket = ticketDao.findOne(id);
		if(ticket == null) return AppResponse.error("Ticket ayant pour id " + id + " inexistant.",Response.Status.NOT_FOUND);

		for (Long resolverId:toSave.getIds()) {
			User resolver = userDao.findOne(resolverId);
			if (resolver != null) ticketDao.addResolver(ticket, resolver);
		}
		return AppResponse.success(null);
	}

	@DELETE
	@Path("/{ticketId}/resolvers/{resolverId}")
	public Response removeResolverFromTicket(@PathParam("ticketId") long ticketId, @PathParam("resolverId") long resolverId) {
		Ticket ticket = ticketDao.findOne(ticketId);
		if(ticket == null) return AppResponse.error("Ticket ayant pour id " + ticketId + " inexistant.",Response.Status.NOT_FOUND);

		User resolver = userDao.findOne(resolverId);
		if(resolver == null) return AppResponse.error("Utilisateur ayant pour id" + resolverId + " inexistant.",Response.Status.NOT_FOUND);

		ticketDao.removeResolver(ticket,resolver);
		return AppResponse.success(null);
	}


	/*************************************** tickets/{id}/discussions *************************************************************/
	@GET
	@Path("/{id}/discussions")
	@Consumes({MediaType.APPLICATION_JSON})
	public Response getAllDiscussionByTicketId(@PathParam("id") Long id) {
		Ticket ticket = ticketDao.findOne(id);
		if(ticket == null) return AppResponse.error("Ticket ayant pour id" + id + " inexistant.",Response.Status.NOT_FOUND);
		List<Object> discussions = new ArrayList<>();
		for(Discussion discussion:ticket.getDiscussions()){
			UserDto author = new UserDto(discussion.getAuthor().getId(), discussion.getAuthor().getName());
			Map<String, Object> toAdd = new HashMap<>();
			toAdd.put("id", discussion.getId());
			toAdd.put("content", discussion.getContent());
			toAdd.put("author", author);
			toAdd.put("createdAt", discussion.getCreatedAt());
			discussions.add(toAdd);
		}
		return AppResponse.success(discussions);
	}


}
