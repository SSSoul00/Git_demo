package com.sssoul;

import com.sssoul.dao.BookDao;
import com.sssoul.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        初始化IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
//        获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
