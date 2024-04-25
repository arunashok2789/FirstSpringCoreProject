package com.springcoreproject1.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject1.annotation.bean");
        Customer customer = context.getBean("customer", Customer.class);
        customer.setCustomerName("Arun");
        customer.setCustomerId(1);

        System.out.println("Customer Details: " + customer.getCustomerId() + " : "+ customer.getCustomerName());

    }
}
