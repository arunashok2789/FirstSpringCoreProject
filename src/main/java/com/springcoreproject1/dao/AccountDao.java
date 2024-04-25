package com.springcoreproject1.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class AccountDao {

    @PostConstruct
   public void getConnection(){
       System.out.println("Initialized after bean creation automatically");
   }

   @PreDestroy
   public void closeConnection(){
       System.out.println("closed connection before Destroy");
   }
}
