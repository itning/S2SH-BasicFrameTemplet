package cn.itning.service;

import cn.itning.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String say() {
        System.out.println("userdao="+userDao);
        return userDao.say();
    }
}
