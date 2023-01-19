package jpa;

import jpa.dao.AbstractJpaDao;
import jpa.dao.DiscussionDao;
import jpa.dao.TagDao;
import jpa.dao.TicketDao;
import jpa.domain.Discussion;
import jpa.domain.Tag;
import jpa.domain.Ticket;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// Creation tagDao et alimentation de la bdd
			AbstractJpaDao tagDao = new TagDao();
			Tag tag1 = new Tag();
			Tag tag2 = new Tag();
			Tag tag3 = new Tag();
			tag1.setLabel("Informatique");
			tag2.setLabel("Mecanique");
			tag3.setLabel("Developpement");
			tagDao.save(tag1);
			tagDao.save(tag2);
			tagDao.save(tag3);

			// Creation DiscussionDao et alimentation de la bdd
			AbstractJpaDao DiscussionDao = new DiscussionDao();
			Discussion discussion1 = new Discussion();
			Discussion discussion2 = new Discussion();
			Discussion discussion3 = new Discussion();
			Discussion discussion4 = new Discussion();
			discussion1.setContenu("Bonjour j'ai consulté votre page; personnellement je ne vois rien à contester");
			discussion2.setContenu("Rebonjour, bah en effet je vois des bugs sur la page1 et page4");
			discussion3.setContenu("Bug resolu");
			discussion4.setContenu("Hello! Quelqu'un a t-il vu mon ticket?");
			DiscussionDao.save(discussion1);
			DiscussionDao.save(discussion2);
			DiscussionDao.save(discussion3);
			DiscussionDao.save(discussion4);

			// Creation TicketDao et alimentation de la bdd
			AbstractJpaDao TicketDao = new TicketDao();
			Ticket ticket1 = new Ticket();
			Ticket ticket2 = new Ticket();
			Ticket ticket3 = new Ticket();
			ticket1.setContent("Informatique");
			ticket2.setContent("Informatique");
			ticket3.setContent("Informatique");
			TicketDao.save(ticket1);
			TicketDao.save(ticket2);
			TicketDao.save(ticket3);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
