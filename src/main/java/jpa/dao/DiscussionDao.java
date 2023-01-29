package jpa.dao;


import jpa.domain.Discussion;

public class DiscussionDao extends AbstractJpaDao <Long, Discussion> {

    public DiscussionDao()
    {
        super(Discussion.class);
    }
}
