package com.sssoul;

import com.sssoul.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        初始化IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取bean
//        DruidDataSource dataSource = (DruidDataSource) ctx.getBean("dataSource");
//        System.out.println(dataSource);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
