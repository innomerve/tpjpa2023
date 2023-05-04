package jpa.dao;

import jpa.domain.Tag;
import jpa.domain.Ticket;

import java.util.HashSet;

public class TagDao extends AbstractJpaDao <Long, Tag> {

    public TagDao()
    {
        super(Tag.class);
    }

    @Override
    public void deleteById(Long entityId) {
        Tag tag = findOne(entityId);
        for (Ticket ticket : new HashSet<Ticket>(tag.getTickets())) {
            ticket.removeTag(tag);
        }
        delete(tag);
    }
}