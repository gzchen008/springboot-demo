package org.spring.springboot.service.impl;

import org.spring.springboot.dao.UserDao;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/23.
 */
@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }
}
