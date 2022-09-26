package com.sssoul.dao.Factory;

import com.sssoul.dao.BookDao;
import com.sssoul.dao.impl.BookDaoImpl;

public class BookDaoFactory2 {
    public BookDao getBookDao(){
        return new BookDaoImpl();
    }
}
