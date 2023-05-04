package jpa.dao;
import jpa.domain.Tag;
import jpa.domain.Ticket;
import jpa.domain.User;

import java.util.HashSet;

public class UserDao extends AbstractJpaDao <Long, User> {

    public UserDao()
    {
        super(User.class);
    }


    @Override
    public void deleteById(Long entityId) {
        User user = findOne(entityId);
        for (Ticket ticket : new HashSet<Ticket>(user.getAffectedTickets())) {
            ticket.removeResolver(user);
        }
        delete(user);
    }
}