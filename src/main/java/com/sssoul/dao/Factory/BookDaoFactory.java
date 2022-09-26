package com.sssoul.dao.Factory;

import com.sssoul.dao.BookDao;
import com.sssoul.dao.impl.BookDaoImpl;

public class BookDaoFactory {
    public static BookDao getBookDao(){
        return new BookDaoImpl();
    }
}
