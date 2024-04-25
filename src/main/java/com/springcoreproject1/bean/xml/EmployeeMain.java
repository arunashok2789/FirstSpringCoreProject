package com.springcoreproject1.bean.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
       Employee emp = context.getBean("employee",Employee.class);
       System.out.println("employee name and id  "+emp.employeeId+" Employee name "+emp.employeeName);

    }
}
