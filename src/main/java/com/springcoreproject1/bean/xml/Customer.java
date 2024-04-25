package com.springcoreproject1.bean.xml;

public class Customer {
    int id;
    String name;



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getCustomerDetails(){
        System.out.println("id is "+id+"  Name is "+name);
    }

}
