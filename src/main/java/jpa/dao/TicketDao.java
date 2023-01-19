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


    public Ticket assignTag(Ticket ticket, Tag tag){
        ticket.addTag(tag);
        this.update(ticket);
        return ticket;
    }

    public Ticket removeTag(Ticket ticket, Tag tag){
        ticket.removeTag(tag);
        this.update(ticket);
        return ticket;
    }

    public Ticket assignResolver(Ticket ticket, User user){
        ticket.addResolver(user);
        this.update(ticket);
        return ticket;
    }

    public Ticket removeResolver(Ticket ticket, User resolverToRemove){
        ticket.removeResolver(resolverToRemove);
        this.update(ticket);
        return ticket;
    }

    public Ticket addDiscussion(Ticket ticket, Discussion discussion){
        ticket.addDiscussion(discussion);
        this.update(ticket);
        return ticket;
    }

    public Ticket removeDiscussion(Ticket ticket, Discussion discussion){
        ticket.removeDiscussion(discussion);
        this.update(ticket);
        return ticket;
    }


}