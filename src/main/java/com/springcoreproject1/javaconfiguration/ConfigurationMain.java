package com.springcoreproject1.javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class ConfigurationMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.springcoreproject1.javaconfiguration");
        Date date = applicationContext.getBean("date", Date.class);

        System.out.println("time..."+date.getTime());

    }
}
