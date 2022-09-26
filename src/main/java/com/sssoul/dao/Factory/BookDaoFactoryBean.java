package com.sssoul.dao.Factory;

import com.sssoul.dao.BookDao;
import com.sssoul.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class BookDaoFactoryBean implements FactoryBean<BookDao> {
    @Override
    public BookDao getObject() throws Exception {
        return new BookDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return BookDao.class;
    }

//    /**
//     * return true则单例  return false则多例 默认单例
//     * @return
//     */
//    @Override
//    public boolean isSingleton() {
//        return false;
//    }
}
