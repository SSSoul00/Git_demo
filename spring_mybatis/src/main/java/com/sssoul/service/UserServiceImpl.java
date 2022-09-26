package com.sssoul.service;

import com.sssoul.dao.UserDao;
import com.sssoul.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public User FindById(Integer id){
        User user = userDao.FindById(id);
        return user;
    }
}
