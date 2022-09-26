package com.sssoul.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 定义通知类
 */
@Component
@Aspect
public class MyAdvice {
    /**
     * 定义切入点
     */
    @Pointcut("execution(void com.sssoul.dao.BookDao.update())")
    private void pointCut(){}

    /**
     * 定义通知方法
     */
    @Before("pointCut()")
    public void before(){
        System.out.println(System.currentTimeMillis());
    }
}
