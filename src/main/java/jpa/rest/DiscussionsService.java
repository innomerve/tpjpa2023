package jpa.rest;

import jpa.dao.DiscussionDao;
import jpa.dao.TicketDao;
import jpa.dao.UserDao;
import jpa.domain.Discussion;
import jpa.domain.Ticket;
import jpa.domain.User;
import jpa.dto.CreateDiscussionDto;
import jpa.dto.DiscussionDto;
import jpa.dto.UpdateDiscussionDto;
import jpa.responses.AppResponse;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Path("api/discussions")
@Produces(MediaType.APPLICATION_JSON)

public class DiscussionsService {
	DiscussionDao discussionDao = new DiscussionDao();
	TicketDao ticketDao = new TicketDao();
	UserDao userDao = new UserDao();

	@GET
	public List<DiscussionDto> getAll() {
		List<Discussion> discussions = discussionDao.findAll();

		List <DiscussionDto> toReturn = new ArrayList<>();
		for(Discussion discussion: discussions){
			DiscussionDto dto = new DiscussionDto();
			dto.setId(discussion.getId());
			dto.setContent(discussion.getContent());
			dto.setAuthor(discussion.getAuthor().getId(), discussion.getAuthor().getName());
			dto.setTicket(discussion.getTicket().getId(), discussion.getTicket().getTitle(), discussion.getTicket().getContent(), discussion.getTicket().getAuthor().getId());
			dto.setCreatedAt(discussion.getCreatedAt());
			toReturn.add(dto);
		}
		return toReturn;
	}

	@GET
	@Path("/{id}")
	public Response getById(@PathParam("id") long id) {
		Discussion discussion = discussionDao.findOne(id);
		if(discussion == null) return AppResponse.error("Discussion ayant pour " + id + " inexistant.",Response.Status.NOT_FOUND);
		
		DiscussionDto dto = new DiscussionDto();
		dto.setId(discussion.getId());
		dto.setContent(discussion.getContent());
		dto.setAuthor(discussion.getAuthor().getId(), discussion.getAuthor().getName());
		dto.setTicket(discussion.getTicket().getId(), discussion.getTicket().getTitle(), discussion.getTicket().getContent(), discussion.getTicket().getAuthor().getId());
		dto.setCreatedAt(discussion.getCreatedAt());
		
		return AppResponse.success(dto);
	}


	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response create(@Valid CreateDiscussionDto toSave) {

		User author = userDao.findOne(toSave.getAuthorId());
		Ticket ticket = ticketDao.findOne(toSave.getTicketId());

		if(author == null || ticket == null) return AppResponse.error("Ticket ou Auteur  inexistant.",Response.Status.NOT_FOUND);

		Discussion discussion = new Discussion();
		discussion.setContent(toSave.getContent());
		discussion.setAuthor(author);
		discussion.setTicket(ticket);
		discussion.setCreatedAt(LocalDateTime.now());

		discussionDao.save(discussion);
		return null;
	}

	@PUT
	@Path("/{id}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response update(@PathParam("id") long id, @Valid UpdateDiscussionDto toUpdate) {
		
		Discussion discussion = discussionDao.findOne(id);

		if(discussion == null) return AppResponse.error("Discussion ayant pour " + id + " inexistant.",Response.Status.NOT_FOUND);

		discussion.setContent(toUpdate.getContent());

		discussionDao.update(discussion);
		
		DiscussionDto dto = new DiscussionDto();
		dto.setId(discussion.getId());
		dto.setContent(discussion.getContent());
		dto.setAuthor(discussion.getAuthor().getId(), discussion.getAuthor().getName());
		dto.setTicket(discussion.getTicket().getId(), discussion.getTicket().getTitle(), discussion.getTicket().getContent(), discussion.getTicket().getAuthor().getId());
		dto.setCreatedAt(discussion.getCreatedAt());
		
		return AppResponse.success(dto);
	}

	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") long id) {
		Discussion discussion = discussionDao.findOne(id);
		if(discussion == null) return AppResponse.error("Discussion ayant pour " + id + " inexistant.",Response.Status.NOT_FOUND);
		discussionDao.deleteById(id);
		return AppResponse.success(null);
	}
}
