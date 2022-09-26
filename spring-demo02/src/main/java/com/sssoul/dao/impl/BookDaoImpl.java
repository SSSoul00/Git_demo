package com.sssoul.dao.impl;

import com.sssoul.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public String test;

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public void save() {
        System.out.println("book dao save....");
        System.out.println(test);
    }
    public void init(){
        System.out.println("init......");
    }
    public void destroy(){
        System.out.println("destroy.....");
    }
}
