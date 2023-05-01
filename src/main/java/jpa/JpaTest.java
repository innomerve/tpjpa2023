package jpa;

import jpa.dao.*;
import jpa.domain.*;

import java.time.LocalDateTime;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
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





			// Creation TicketDao et alimentation de la bdd
			AbstractJpaDao TicketDao = new TicketDao();
			Ticket ticket1 = new Ticket();
			Ticket ticket2 = new TicketBug();
			ticket1.setContent("Informatique");
			ticket1.setTitle("Bonjour je rencontre un très très gros problème");
			ticket1.setCreatedAt(LocalDateTime.now());
			ticket1.setAuthor(user1);
			ticket1.addTag(tag1); ticket1.addTag(tag2); ticket1.addTag(tag4);ticket1.addTag(tag5);
			TicketDao.save(ticket1);


			ticket2.setContent("Informatique");
			ticket2.setTitle("Why do we use it?");
			ticket2.setCreatedAt(LocalDateTime.now());
			ticket2.setAuthor(user3);
			ticket2.addTag(tag3); ticket2.addTag(tag2); ticket2.addTag(tag6);
			TicketDao.save(ticket2);



			// Creation DiscussionDao et alimentation de la bdd
			AbstractJpaDao DiscussionDao = new DiscussionDao();
			Discussion discussion1 = new Discussion();
			Discussion discussion2 = new Discussion();
			Discussion discussion3 = new Discussion();
			Discussion discussion4 = new Discussion();

			discussion1.setContent("Bonjour j'ai consulté votre page; personnellement je ne vois rien à contester");
			discussion1.setAuthor(user2);
			discussion1.setTicket(ticket1);
			discussion1.setCreatedAt(LocalDateTime.now());

			discussion2.setContent("Rebonjour, bah en effet je vois des bugs sur la page1 et page4");
			discussion2.setAuthor(user3);
			discussion2.setTicket(ticket1);
			discussion2.setCreatedAt(LocalDateTime.now());

			discussion3.setContent("Bug resolu");
			discussion3.setAuthor(user2);
			discussion3.setTicket(ticket1);
			discussion3.setCreatedAt(LocalDateTime.now());

			discussion4.setContent("Hello! Quelqu'un a t-il vu mon ticket?");
			discussion4.setAuthor(user6);
			discussion4.setTicket(ticket2);
			discussion4.setCreatedAt(LocalDateTime.now());

			DiscussionDao.save(discussion1);
			DiscussionDao.save(discussion2);
			DiscussionDao.save(discussion3);
			DiscussionDao.save(discussion4);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
