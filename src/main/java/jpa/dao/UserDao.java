package jpa.dao;

import java.util.List;

import jpa.EntityManagerHelper;
import jpa.domain.User;

public class UserDao extends AbstractJpaDao <Long, User> {

    public UserDao()
    {
        super(User.class);
    }
}