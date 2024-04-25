package com.springcoreproject1.bean.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
     Student student =  (Student)applicationContext.getBean("student");

     System.out.println("Student id is "+student.id+", Student name is   "+student.studentName);

    }
}
