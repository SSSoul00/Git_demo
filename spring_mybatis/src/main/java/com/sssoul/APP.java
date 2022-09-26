package com.sssoul;

import com.sssoul.config.SpringConfig;
import com.sssoul.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class APP {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService us = ctx.getBean(UserService.class);
        System.out.println(us.FindById(1));
    }
}
