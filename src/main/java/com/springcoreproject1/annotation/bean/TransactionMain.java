package com.springcoreproject1.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject1.annotation.bean");
        Transaction transaction = context.getBean("transaction", Transaction.class);

        transaction.setTransactionId(27);
        transaction.setTransactionAmount(1000.0);
        transaction.setAccountHolderName("Virat Kohli");

        System.out.println("Account Holder Name " + transaction.getAccountHolderName()
                + ", Transaction Amount " + transaction.getTransactionAmount() + ", Transaction Id " + transaction.getTransactionId());

    }
}
