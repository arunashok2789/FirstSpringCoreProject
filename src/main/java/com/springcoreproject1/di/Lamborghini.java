package com.springcoreproject1.di;

import org.springframework.stereotype.Component;

@Component
public class Lamborghini implements Vehicle {
    @Override
    public void engine() {
        System.out.println("Function from Lamborghini");
    }
}
