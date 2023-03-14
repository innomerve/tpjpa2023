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
import javax.ws.rs.core.Response;

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
	
	@GET
	public List<UserDto> getAll() {		
		List<User> users = userDao.findAll();

		List<UserDto> toReturn = new ArrayList<>();
		for (User user : users) {
			UserDto dto = new UserDto();
			dto.setId(user.getId());
			dto.setName(user.getName());
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
		return AppResponse.success(dto);
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
	public Response update(@PathParam("id") long id, @Valid CreateOrUpdateUserDto toUpdate) {
		
		User user = userDao.findOne(id);

		if(user == null) return AppResponse.error("Utilisateur ayant pour " + id + " inexistant.",Response.Status.NOT_FOUND);

		user.setName(toUpdate.getName());	
		
		return AppResponse.success(userDao.update(user));
	}

	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") long id) {
		User user = userDao.findOne(id);
		if(user == null) return AppResponse.error("Utilisateur ayant pour " + id + " inexistant.",Response.Status.NOT_FOUND);	
		userDao.deleteById(id);
		return AppResponse.success(null);
	}
}
