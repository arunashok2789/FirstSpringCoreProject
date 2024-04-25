package com.springcoreproject1.componlib;

import org.springframework.stereotype.Component;

@Component
public class Transaction {
    int transactionId;
    String transactionDate;

    Double transactionAmount;

    public Transaction() {
        this.transactionId = 155;
        this.transactionDate = "27 Aug 1989";
        this.transactionAmount = 40000.0;
    }

    public void getTransactionDetails() {
        System.out.println("Thransaction Amount is ..." + this.transactionAmount);
    }
}
