package com.springcoreproject1.bean.xml;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FacultyMain {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("/Users/arunkumarashokan/SpringBootVideos/applicationcontext.xml");
       Faculty  faculty = fileSystemXmlApplicationContext.getBean("faculty",Faculty.class);
        System.out.println("employee name and id  "+faculty.id+" Employee name "+faculty.name);
    }
}
