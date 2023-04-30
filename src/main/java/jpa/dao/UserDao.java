package jpa.dao;
import jpa.domain.User;

public class UserDao extends AbstractJpaDao <Long, User> {

    public UserDao()
    {
        super(User.class);
    }
}