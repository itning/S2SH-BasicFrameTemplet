package cn.itning.dao;

import org.hibernate.SessionFactory;

public class UserDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public String say() {
        System.out.println(sessionFactory);
        return "ok";
    }
}
