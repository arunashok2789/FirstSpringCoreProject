package com.springcoreproject1.bean.xml;

public class Account {
    int id;
    String name;
    Customer customer;


    public void setId(int id) {
        this.id = id;
    }



    public void setName(String name) {
        this.name = name;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void getAccountDetails(){
        System.out.println("id is "+id+", name is "+name+", customer details"+customer.name);
    }
}
