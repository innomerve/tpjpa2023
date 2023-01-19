package jpa.dao;

import jpa.domain.Tag;
import jpa.domain.Ticket;

public class TagDao extends AbstractJpaDao <Long, Tag> {

    public TagDao()
    {
        super(Tag.class);
    }

    public Tag assignTicket(Tag tag, Ticket ticket){
        tag.addTicket(ticket);
        this.update(tag);
        return tag;
    }

    public Tag removeTicket(Tag tag, Ticket ticket){
        tag.removeTicket(ticket);
        this.update(tag);
        return tag;
    }
}