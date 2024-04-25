package com.springcoreproject1.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject1.componentscan");
       TransactionReport transactionReport = context.getBean("transactionReport",TransactionReport.class);
       transactionReport.getReportDetails();
    }
}
