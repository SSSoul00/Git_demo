package com.sssoul.service;

import com.sssoul.domain.User;
import org.springframework.stereotype.Service;


public interface UserService {
    public User FindById(Integer id);
}
