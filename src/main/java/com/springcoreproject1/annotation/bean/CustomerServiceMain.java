package com.springcoreproject1.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerServiceMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject1.annotation.bean");
        CustomerService customerService = context.getBean("customerservice", CustomerService.class);
        customerService.setCustomerId(7);
        customerService.setCustomerName("MSD");
        customerService.setCustomerAddress("Ranchi");

         System.out.println("Customer Id: " + customerService.getCustomerId() + " , Customer name"+ customerService.getCustomerName());
    }

}
