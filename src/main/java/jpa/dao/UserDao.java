package jpa.dao;

import jpa.domain.Discussion;
import jpa.domain.Ticket;
import jpa.domain.User;

public class UserDao extends AbstractJpaDao <Long, User> {

    public UserDao()
    {
        super(User.class);
    }

    public User assignAffectedTicket(User user, Ticket ticket){
        user.addAffectedTicket(ticket);
        this.update(user);
        return user;
    }

    public User removeAffectedTicket(User user, Ticket ticket){
        user.removeAffectedTicket(ticket);
        this.update(user);
        return user;
    }


    public User assignCreatedTicket(User user, Ticket ticket){
        user.addCreatedTicket(ticket);
        this.update(user);
        return user;
    }

    public User removeCreatedTicket(User user, Ticket ticket){
        user.removeCreatedTicket(ticket);
        this.update(user);
        return user;
    }


    public User addDiscussion(User user, Discussion discussion){
        user.addDiscussion(discussion);
        this.update(user);
        return user;
    }

    public User removeDiscussion(User user, Discussion discussion){
        user.removeDiscussion(discussion);
        this.update(user);
        return user;
    }
}