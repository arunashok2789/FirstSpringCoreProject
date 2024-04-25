package com.springcoreproject1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
   Mercedes car;

    public void print(){
        car.engine();
    }
}
