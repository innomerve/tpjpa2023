package jpa.dao;

import java.util.List;

import jpa.EntityManagerHelper;
import jpa.domain.Discussion;

public class DiscussionDao extends AbstractJpaDao <Long, Discussion> {

    public DiscussionDao()
    {
        super(Discussion.class);
    }
}
