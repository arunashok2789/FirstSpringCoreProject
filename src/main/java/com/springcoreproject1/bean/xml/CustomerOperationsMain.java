package com.springcoreproject1.bean.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerOperationsMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterbeans.xml");
        Account account = applicationContext.getBean("account",Account.class);
        account.getAccountDetails();

    }
}
