package com.springcoreproject1.componentscan;

import com.springcoreproject1.componlib.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.springcoreproject1.componlib")
public class TransactionReport {

    String reportName;

    @Autowired
    Transaction transaction;

    public TransactionReport() {
        this.reportName = "Payment Report";
    }

    public void getReportDetails(){
        System.out.println("Report Details are ... Report name "+this.reportName);
       transaction.getTransactionDetails();
    }
}
