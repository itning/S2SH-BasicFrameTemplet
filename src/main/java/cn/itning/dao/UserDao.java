package cn.itning.dao;

import cn.itning.entity.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {


    public String say() {
       // User user = this.getHibernateTemplate().get(User.class, "1");
        User user = currentSession().get(User.class, "1");
        if (user != null) {
            System.out.println(user.getId() + ":" + user.getName());
        } else {
            System.out.println("user is null");
        }
        return "ok";
    }
}
