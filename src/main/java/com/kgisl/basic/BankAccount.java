package com.kgisl.basic;

import java.util.ArrayList;
import java.util.List;

public class BankAccount{
    Customer customer; // Aggregation 
    private Long accountNumber;
    private Double balance;
    List<Transaction> transLog; //Composition 

    public BankAccount(Customer customer, Long accountNumber, Double balance) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transLog = new ArrayList<Transaction>();
    }
    public Customer getCustomer() {
        return this.customer;
    }

    public Long getAccountNumber() {
        return this.accountNumber;
    }

    public Double getBalance() {
        return this.balance;
    }

    public List<Transaction> getTransLog() {
        return this.transLog;
    }

    @Override
    public String toString() {
        return "{" +
            " customer='" + getCustomer() + "'" +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", balance='" + getBalance() + "'" +
            ", transLog='" + getTransLog() + "'" +
            "}";
    }

}
