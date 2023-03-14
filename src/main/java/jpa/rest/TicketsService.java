package jpa.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import jpa.dao.TagDao;
import jpa.dao.TicketDao;
import jpa.dao.UserDao;

import jpa.domain.Discussion;
import jpa.domain.Tag;
import jpa.domain.Ticket;
import jpa.domain.User;

import jpa.dto.CreateTicketDto;
import jpa.dto.TicketDto;
import jpa.responses.AppResponse;

@Path("api/tickets")
@Produces(MediaType.APPLICATION_JSON)

public class TicketsService  {


	TicketDao ticketDao = new TicketDao();
	UserDao userDao = new UserDao();
	TagDao tagDao = new TagDao();

	
	@GET
	public List<TicketDto> getAll() {

		List <Ticket> tickets = ticketDao.findAll();
		List <TicketDto> toReturn = new ArrayList<>();
		for(Ticket ticket: tickets){
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
		return AppResponse.success(dto);
	}


	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Ticket create(@Valid CreateTicketDto toSave) {
		
		User author = userDao.findOne(toSave.getAuthorId());
		
		if(author == null) throw new WebApplicationException("Utilisateur ayant pour " + toSave.getAuthorId() + " inexistant.", 404);
		
		System.err.println(" taggggggggggggggggggggggggggggggggg " + toSave.getTagIds());
		
		return null;
	}


}
