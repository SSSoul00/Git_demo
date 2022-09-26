package com.sssoul.dao.impl;


import com.sssoul.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save....");
    }

    public void init() {
        System.out.println("init......");
    }

    public void destroy() {
        System.out.println("destroy.....");
    }
}
