package com.springcoreproject1.di;

import org.springframework.stereotype.Component;

@Component
public class Mercedes implements Vehicle {
    @Override
    public void engine() {
        System.out.println("It is from mercedz Benz ");
    }
}
