package com.springcoreproject1.di;

import com.springcoreproject1.di.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcoreproject1.di");
       Car car =  context.getBean("car", Car.class);
       car.print();
    }
}
