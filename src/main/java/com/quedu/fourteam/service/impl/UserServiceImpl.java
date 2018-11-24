package com.quedu.fourteam.service.impl;

import com.quedu.fourteam.dao.UserDao;
import com.quedu.fourteam.pojo.User;
import com.quedu.fourteam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User register(User user) {
        return userDao.save(user);
    }
}
