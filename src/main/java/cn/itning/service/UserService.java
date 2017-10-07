package cn.itning.service;

import cn.itning.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public String say() {
        System.out.println("userdao="+userDao);
        return userDao.say();
    }
}
