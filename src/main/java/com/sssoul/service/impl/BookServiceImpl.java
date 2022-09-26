package com.sssoul.service.impl;

import com.sssoul.dao.BookDao;
import com.sssoul.dao.impl.BookDaoImpl;
import com.sssoul.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save.....");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
