package jpa.rest;

import jpa.dao.TagDao;
import jpa.dao.TicketDao;
import jpa.dao.UserDao;
import jpa.domain.Tag;
import jpa.domain.Ticket;
import jpa.domain.User;
import jpa.dto.CreateOrUpdateTagDto;
import jpa.dto.ListTagDto;
import jpa.dto.TagDto;
import jpa.dto.TicketDto;
import jpa.dto.UserDto;
import jpa.responses.AppResponse;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("api/tags")
@Produces(MediaType.APPLICATION_JSON)

public class TagsService {


	TicketDao ticketDao = new TicketDao();
	UserDao userDao = new UserDao();
	TagDao tagDao = new TagDao();

	
	@GET
	public List<ListTagDto> getAll() {
		List<Tag> tags = tagDao.findAll();

		List<ListTagDto> toReturn = new ArrayList<>();
		for (Tag tag : tags) {
			ListTagDto dto = new ListTagDto();
			dto.setId(tag.getId());
			dto.setLabel(tag.getLabel());
			dto.setNbTicket(tag.getTickets().size());
			toReturn.add(dto);
		}
		return toReturn;
	}

	@GET
	@Path("/{id}")
	public Response getById(@PathParam("id") long id) {
		Tag tag = tagDao.findOne(id);
		if(tag == null) return AppResponse.error("Tag ayant pour " + id + " inexistant.",Response.Status.NOT_FOUND);

		TagDto dto = new TagDto();
		dto.setId(tag.getId());
		dto.setLabel(tag.getLabel());
		dto.setTickets(getTicketsByTags(tag));

		return AppResponse.success(dto);
	}


	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Tag create(@Valid CreateOrUpdateTagDto toSave) {
		
		Tag tag = new Tag();
		tag.setLabel(toSave.getLabel());
		tagDao.save(tag)	;
		return null;
	}

	@PUT
	@Path("/{id}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response update(@PathParam("id") long id, @Valid CreateOrUpdateTagDto toUpdate) {
		
		Tag tag = tagDao.findOne(id);

		if(tag == null) return AppResponse.error("Tag ayant pour " + id + " inexistant.",Response.Status.NOT_FOUND);

		tag.setLabel(toUpdate.getLabel());
		
		return AppResponse.success(tagDao.update(tag));
	}

	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") long id) {
		Tag tag = tagDao.findOne(id);
		if(tag == null) return AppResponse.error("Tag ayant pour " + id + " inexistant.",Response.Status.NOT_FOUND);
		tagDao.deleteById(id);
		return AppResponse.success(null);
	}


	/*************************************** tags/{id}/tickets *************************************************************/
	@GET
	@Path("/{id}/tickets")
	@Consumes({MediaType.APPLICATION_JSON})
	public Response getAllTicketsByTagId(@PathParam("id") Long id) {

		Tag tag = tagDao.findOne(id);
		if(tag == null) return AppResponse.error("Tag ayant pour id" + id + " inexistant.",Response.Status.NOT_FOUND);

		return AppResponse.success(this.getTicketsByTags(tag));
	}



	private List<TicketDto> getTicketsByTags(Tag tag){
		List <TicketDto> toReturn = new ArrayList<>();
		for(Ticket ticket: tag.getTickets()){
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
			for(Tag t:ticket.getTags()){
				Map<String, Object> toAddTag = new HashMap<>();
				toAddTag.put("id", t.getId());
				toAddTag.put("label", t.getLabel());
				dto.addTag(toAddTag);
			}
			toReturn.add(dto);
		}
		return toReturn;
	}


}
