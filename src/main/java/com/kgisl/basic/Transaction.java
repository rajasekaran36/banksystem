package com.kgisl.basic;

import java.util.Date;

public class Transaction {
    private String customerName;
    private String accountNumber;
    private Date date;
    Double balanceBeforeTransaction;
    Double balanceAfterTransaction;
    String transactionType; //Cr for credit Dr for Debit

    public Transaction(String customerName, String accountNumber, Date date, Double balanceBeforeTransaction, Double balanceAfterTransaction, String transactionType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.date = date;
        this.balanceBeforeTransaction = balanceBeforeTransaction;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.transactionType = transactionType;
    }


    public String getCustomerName() {
        return this.customerName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public Date getDate() {
        return this.date;
    }

    public Double getBalanceBeforeTransaction() {
        return this.balanceBeforeTransaction;
    }

    public Double getBalanceAfterTransaction() {
        return this.balanceAfterTransaction;
    }

    public String getTransactionType() {
        return this.transactionType;
    }


    @Override
    public String toString() {
        return "{" +
            " customerName='" + getCustomerName() + "'" +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", date='" + getDate() + "'" +
            ", balanceBeforeTransaction='" + getBalanceBeforeTransaction() + "'" +
            ", balanceAfterTransaction='" + getBalanceAfterTransaction() + "'" +
            ", transactionType='" + getTransactionType() + "'" +
            "}";
    }

}