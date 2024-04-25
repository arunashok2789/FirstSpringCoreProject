package com.springcoreproject1.annotation.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DBMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject1.annotation.scope");
       Dbconnection dbConnection = context.getBean("dbconnection", Dbconnection.class);
        System.out.println("status is .."+dbConnection.isStatus());
    }
}
