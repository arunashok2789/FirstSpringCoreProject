package com.springcoreproject1.javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class JavaBasedConfig {
    @Bean(name = "date")
    public Date date() {
        return new Date();
    }
}
