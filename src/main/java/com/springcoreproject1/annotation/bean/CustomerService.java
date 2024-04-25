package com.springcoreproject1.annotation.bean;


import org.springframework.stereotype.Service;

@Service("customerservice")
public class CustomerService {
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    int customerId;
    String customerName;

    String customerAddress;

    public CustomerService() {
        this.customerId = 222;
        this.customerName = "MS Dhoni";
        this.customerAddress = "Ranchi";

    }

   public void printCustomerDetails(){
       System.out.println("Customer id" + customerId + ", Customer Name " + customerName+", CustomerAddress " + customerAddress);
   }

}
