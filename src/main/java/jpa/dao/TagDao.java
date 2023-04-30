package jpa.dao;

import jpa.domain.Tag;
import jpa.domain.Ticket;

public class TagDao extends AbstractJpaDao <Long, Tag> {

    public TagDao()
    {
        super(Tag.class);
    }
}