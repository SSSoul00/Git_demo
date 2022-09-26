package com.sssoul.service.impl;

import com.sssoul.dao.BookDao;
import com.sssoul.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Value("${jdbc.driver}")
    private String name;
    @Override
    public void save() {
        System.out.println("book service save....."+ name);
        bookDao.save();
    }
}
