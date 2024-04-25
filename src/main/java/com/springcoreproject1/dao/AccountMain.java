package com.springcoreproject1.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject1.dao");
       AccountDao dao = context.getBean("accountDao", AccountDao.class);
       dao.closeConnection();

    }
}
