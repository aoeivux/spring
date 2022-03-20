package com.aoeivux.service;

import com.aoeivux.dao.UserDao;

public class UserServiceImpl implements UserService{
    //程序控制对象
//private final UserDaoOracleImpl udi = new UserDaoOracleImpl();

    //IOC控制反转

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }

}
