package jpa.rest;

import java.util.ArrayList;
import java.util.List;

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
import javax.ws.rs.WebApplicationException;

import jpa.dao.TagDao;
import jpa.dao.TicketDao;
import jpa.dao.UserDao;

import jpa.domain.User;

import jpa.dto.CreateOrUpdateUserDto;
import jpa.dto.ListUserDto;

@Path("api/users")
@Produces(MediaType.APPLICATION_JSON)

public class UsersService  {


	TicketDao ticketDao = new TicketDao();
	UserDao userDao = new UserDao();
	TagDao tagDao = new TagDao();

	
	@GET
	public List<ListUserDto> getAll() {		
		List<User> users = userDao.findAll();

		List<ListUserDto> toReturn = new ArrayList<>();
		for (User user : users) {
			ListUserDto dto = new ListUserDto();
			dto.setId(user.getId());
			dto.setName(user.getName());
			toReturn.add(dto);
		}
		return toReturn;
	}

	@GET
	@Path("/{id}")
	public User getById(@PathParam("id") long id) {	
		User user = userDao.findOne(id);
		if (user == null) throw new WebApplicationException("Utilisateur ayant pour " + id + " inexistant.", 404);
		return user;
	}


	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public User create(@Valid CreateOrUpdateUserDto toSave) {	
		
		User user = new User();
		user.setName(toSave.getName());	
		userDao.save(user)	;
		return null;
	}

	@PUT
	@Path("/{id}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public User update(@PathParam("id") long id, @Valid CreateOrUpdateUserDto toUpdate) {	
		
		User user = userDao.findOne(id);

		if(user == null) throw new WebApplicationException("Utilisateur ayant pour " + id + " inexistant.", 404);
		
		user.setName(toUpdate.getName());	
		
		return userDao.update(user);
	}

	@DELETE
	@Path("/{id}")
	public User delete(@PathParam("id") long id) {	
		
		User user = userDao.findOne(id);

		if(user == null) throw new WebApplicationException("Utilisateur ayant pour " + id + " inexistant.", 404);
		
		userDao.deleteById(id);

		return null;
	}


}
