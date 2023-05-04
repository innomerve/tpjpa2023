package jpa.rest;

import java.util.*;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import jpa.dao.DiscussionDao;
import jpa.domain.Discussion;
import jpa.domain.Tag;
import jpa.domain.Ticket;
import jpa.dto.DiscussionDto;
import jpa.dto.TicketDto;
import jpa.responses.AppResponse;

import jpa.dao.TagDao;
import jpa.dao.TicketDao;
import jpa.dao.UserDao;

import jpa.domain.User;

import jpa.dto.CreateOrUpdateUserDto;
import jpa.dto.UserDto;

@Path("api/users")
@Produces(MediaType.APPLICATION_JSON)

public class UsersService  {
	UserDao userDao = new UserDao();
	TicketDao ticketDao = new TicketDao();
	DiscussionDao discussionDao = new DiscussionDao();

	@GET
	public List<UserDto> getAll() {
		List<User> users = userDao.findAll();

		List<UserDto> toReturn = new ArrayList<>();
		for (User user : users) {
			UserDto dto = new UserDto();
			dto.setId(user.getId());
			dto.setName(user.getName());
			dto.setNbDiscussion(user.getDiscussions().size());
			dto.setNbCreatedTicket(user.getCreatedTickets().size());
			dto.setNbAffectedTicket(user.getAffectedTickets().size());

			toReturn.add(dto);
		}
		return toReturn;
	}

	@GET
	@Path("/{id}")
	public Response getById(@PathParam("id") long id) {
		User user = userDao.findOne(id);
		if(user == null) return AppResponse.error("Utilisateur ayant pour " + id + " inexistant.",Response.Status.NOT_FOUND);
		UserDto dto = new UserDto();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setNbDiscussion(user.getDiscussions().size());
		dto.setNbCreatedTicket(user.getCreatedTickets().size());
		dto.setNbAffectedTicket(user.getAffectedTickets().size());
		return AppResponse.success(dto);
	}


	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public User create(@Valid CreateOrUpdateUserDto toSave) {

		User user = new User();
		user.setName(toSave.getName());
		userDao.save(user);
		return null;
	}

	@PUT
	@Path("/{id}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response update(@PathParam("id") long id, @Valid CreateOrUpdateUserDto toUpdate) {

		User user = userDao.findOne(id);

		if(user == null) return AppResponse.error("Utilisateur ayant pour id " + id + " inexistant.",Response.Status.NOT_FOUND);

		user.setName(toUpdate.getName());
		user = userDao.update(user);
		UserDto dto = new UserDto();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setNbDiscussion(user.getDiscussions().size());
		dto.setNbCreatedTicket(user.getCreatedTickets().size());
		dto.setNbAffectedTicket(user.getAffectedTickets().size());

		return AppResponse.success(dto);
	}

	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") long id) {
		User user = userDao.findOne(id);

		for (Discussion d : new HashSet<Discussion>(user.getDiscussions())) {
			discussionDao.deleteById(d.getId());
		}

		if(user == null) return AppResponse.error("Utilisateur ayant pour " + id + " inexistant.",Response.Status.NOT_FOUND);
		for (Ticket ticket : new HashSet<Ticket>(user.getCreatedTickets())) {
			ticketDao.deleteById(ticket.getId());
		}
		userDao.deleteById(id);
		return AppResponse.success(null);
	}


	/*************************************** users/{id}/tickets/affected *************************************************************/
	@GET
	@Path("/{id}/tickets/affected")
	@Consumes({MediaType.APPLICATION_JSON})
	public Response getAllAffectedTicketsByUserId(@PathParam("id") Long id) {
		User user = userDao.findOne(id);
		if(user == null) return AppResponse.error("Utilisateur ayant pour id" + id + " inexistant.",Response.Status.NOT_FOUND);
		return AppResponse.success(this.getTicketsByUsers(user,false));
	}


	/*************************************** users/{id}/tickets/created *************************************************************/
	@GET
	@Path("/{id}/tickets/created")
	@Consumes({MediaType.APPLICATION_JSON})
	public Response getAllCreatedTicketsByUserId(@PathParam("id") Long id) {
		User user = userDao.findOne(id);
		if(user == null) return AppResponse.error("Utilisateur ayant pour id" + id + " inexistant.",Response.Status.NOT_FOUND);
		return AppResponse.success(this.getTicketsByUsers(user,true));
	}


	/*************************************** users/{id}/discussions *************************************************************/
	@GET
	@Path("/{id}/discussions")
	@Consumes({MediaType.APPLICATION_JSON})
	public Response getAllDiscussionsByUserId(@PathParam("id") Long id) {
		User user = userDao.findOne(id);
		if(user == null) return AppResponse.error("Utilisateur ayant pour id" + id + " inexistant.",Response.Status.NOT_FOUND);

		List <DiscussionDto> toReturn = new ArrayList<>();
		for(Discussion discussion: user.getDiscussions()){
			DiscussionDto dto = new DiscussionDto();
			dto.setId(discussion.getId());
			dto.setContent(discussion.getContent());
			dto.setAuthor(discussion.getAuthor().getId(), discussion.getAuthor().getName());
			dto.setTicket(discussion.getTicket().getId(), discussion.getTicket().getTitle(), discussion.getTicket().getContent(), discussion.getTicket().getAuthor().getId());
			dto.setCreatedAt(discussion.getCreatedAt());
			toReturn.add(dto);
		}
		return AppResponse.success(toReturn);
	}


	private List<TicketDto> getTicketsByUsers(User user, Boolean created){
		List <TicketDto> toReturn = new ArrayList<>();
		Set<Ticket> tickets = new HashSet<>();
		if (created) tickets = user.getCreatedTickets(); else tickets = user.getCreatedTickets();
		for(Ticket ticket: tickets){
			TicketDto dto = new TicketDto();
			dto.setId(ticket.getId());
			dto.setTitle(ticket.getTitle());
			dto.setContent(ticket.getContent());
			dto.setAuthor(ticket.getAuthor().getId(), ticket.getAuthor().getName());
			if (ticket.getCreatedAt() != null) dto.setCreatedAt(ticket.getCreatedAt());
			if (ticket.getClosedAt() != null) dto.setClosedAt(ticket.getClosedAt());
			for(User u:ticket.getResolvers()){
				Map<String, Object> resolver = new HashMap<>();
				resolver.put("id", u.getId());
				resolver.put("name", u.getName());
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
