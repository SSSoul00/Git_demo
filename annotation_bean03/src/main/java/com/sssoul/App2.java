package com.sssoul;

import com.sssoul.config.SpringConfig;
import com.sssoul.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();

        Object bookDao = ctx.getBean("bookDao");
        System.out.println(bookDao);

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
