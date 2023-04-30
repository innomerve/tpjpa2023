package jpa.dao;

import jpa.domain.Discussion;
import jpa.domain.Tag;
import jpa.domain.Ticket;
import jpa.domain.User;

public class TicketDao extends AbstractJpaDao <Long, Ticket> {

    public TicketDao()
    {
        super(Ticket.class);
    }

    public Ticket addTag(Ticket ticket, Tag tag){
        ticket.addTag(tag);
        this.update(ticket);
        return ticket;
    }

    public Ticket removeTag(Ticket ticket, Tag tag){
        ticket.removeTag(tag);
        this.update(ticket);
        return ticket;
    }

    public Ticket addResolver(Ticket ticket, User user){
        ticket.addResolver(user);
        this.update(ticket);
        return ticket;
    }

    public Ticket removeResolver(Ticket ticket, User resolverToRemove){
        ticket.removeResolver(resolverToRemove);
        this.update(ticket);
        return ticket;
    }

}