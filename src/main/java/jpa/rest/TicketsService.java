package jpa.rest;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.WebApplicationException;

import jpa.dao.TagDao;
import jpa.dao.TicketDao;
import jpa.dao.UserDao;

import jpa.domain.Ticket;
import jpa.domain.User;

import jpa.dto.NewTicketDto;

@Path("api/tickets")
@Produces(MediaType.APPLICATION_JSON)

public class TicketsService  {


	TicketDao ticketDao = new TicketDao();
	UserDao userDao = new UserDao();
	TagDao tagDao = new TagDao();

	
	@GET
	public List<Ticket> getAll() {		
		return ticketDao.findAll();
	}

	@GET
	@Path("/{id}")
	public Ticket getById(@PathParam("id") long id) {	
		Ticket ticket = ticketDao.findOne(id);
		if (ticket == null) throw new WebApplicationException("Ticket ayant pour " + id + " inexistant.", 404);
		return ticket;
	}


	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Ticket create(@Valid NewTicketDto toSave) {	
		
		User author = userDao.findOne(toSave.getAuthorId());
		
		if(author == null) throw new WebApplicationException("Utilisateur ayant pour " + toSave.getAuthorId() + " inexistant.", 404);
		
		System.err.println(" taggggggggggggggggggggggggggggggggg " + toSave.getTagIds());
		
		return null;
	}


}
