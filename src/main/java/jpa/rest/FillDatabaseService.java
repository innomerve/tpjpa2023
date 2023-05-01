package jpa.rest;

import jpa.dao.*;
import jpa.domain.Discussion;
import jpa.domain.Tag;
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Path("api/fill/database")
@Produces(MediaType.APPLICATION_JSON)

public class FillDatabaseService {
	DiscussionDao discussionDao = new DiscussionDao();
	TicketDao ticketDao = new TicketDao();
	UserDao userDao = new UserDao();

	@GET
	public Response fill(){
		//************************************* Tags ******************************////////////
		AbstractJpaDao tagDao = new TagDao();
		Tag tag1 = new Tag();
		Tag tag2 = new Tag();
		Tag tag3 = new Tag();
		Tag tag4 = new Tag();
		Tag tag5 = new Tag();
		Tag tag6 = new Tag();

		tag1.setLabel("Informatique");
		tag2.setLabel("Mecanique");
		tag3.setLabel("Developpement");
		tag4.setLabel("Chimie");
		tag5.setLabel("Bug");
		tag6.setLabel("Difficile");

		tagDao.save(tag1);
		tagDao.save(tag2);
		tagDao.save(tag3);
		tagDao.save(tag4);
		tagDao.save(tag5);
		tagDao.save(tag6);


		//************************************* Users ******************************////////////


		AbstractJpaDao userDao = new UserDao();
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		User user5 = new User();
		User user6 = new User();

		user1.setName("Toni");
		user2.setName("Kemi");
		user3.setName("Baké");
		user4.setName("Momo");
		user5.setName("Madi");
		user6.setName("Nanou");

		userDao.save(user1);
		userDao.save(user2);
		userDao.save(user3);
		userDao.save(user4);
		userDao.save(user5);
		userDao.save(user6);


		//************************************* Tickets ******************************////////////
		AbstractJpaDao ticketDao = new TicketDao();


		Ticket ticket1 = new Ticket();
		ticket1.setTitle("Bonjour je rencontre un très très gros problème");
		ticket1.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		ticket1.setCreatedAt(LocalDateTime.now());
		ticket1.setAuthor(user1);
		ticket1.addTag(tag1); ticket1.addTag(tag2); ticket1.addTag(tag4);ticket1.addTag(tag5);
		ticketDao.save(ticket1);

		Ticket ticket2 = new Ticket();
		ticket2.setTitle("Why do we use it?");
		ticket2.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		ticket2.setCreatedAt(LocalDateTime.now());
		ticket2.setAuthor(user3);
		ticket2.addTag(tag3); ticket2.addTag(tag2); ticket2.addTag(tag6);
		ticketDao.save(ticket2);

		//************************************* Discussions ******************************////////////
		AbstractJpaDao discussionDao = new DiscussionDao();

		Discussion discussion1= new Discussion();
		discussion1.setContent("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
		discussion1.setAuthor(user2);
		discussion1.setTicket(ticket1);
		discussion1.setCreatedAt(LocalDateTime.now());
		discussionDao.save(discussion1);

		Discussion discussion2= new Discussion();
		discussion2.setContent("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
		discussion2.setAuthor(user4);
		discussion2.setTicket(ticket1);
		discussion2.setCreatedAt(LocalDateTime.now());
		discussionDao.save(discussion2);

		Discussion discussion3= new Discussion();
		discussion3.setContent("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
		discussion3.setAuthor(user5);
		discussion3.setTicket(ticket1);
		discussion3.setCreatedAt(LocalDateTime.now());
		discussionDao.save(discussion3);


		Discussion discussion4= new Discussion();
		discussion4.setContent("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
		discussion4.setAuthor(user6);
		discussion4.setTicket(ticket2);
		discussion4.setCreatedAt(LocalDateTime.now());
		discussionDao.save(discussion4);


		Discussion discussion6= new Discussion();
		discussion6.setContent("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
		discussion6.setAuthor(user2);
		discussion6.setTicket(ticket2);
		discussion6.setCreatedAt(LocalDateTime.now());
		discussionDao.save(discussion6);


		Discussion discussion5= new Discussion();
		discussion5.setContent("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
		discussion5.setAuthor(user3);
		discussion5.setTicket(ticket2);
		discussion5.setCreatedAt(LocalDateTime.now());
		discussionDao.save(discussion5);
		return AppResponse.success(null);
	}
}
