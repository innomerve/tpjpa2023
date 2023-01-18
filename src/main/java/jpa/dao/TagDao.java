package jpa.dao;

import java.util.List;

import jpa.EntityManagerHelper;
import jpa.domain.Tag;

public class TagDao extends AbstractJpaDao <Long, Tag> {

    public TagDao()
    {
        super(Tag.class);
    }
}