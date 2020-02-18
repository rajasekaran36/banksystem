package com.kgisl.basic;

public class Customer{
    private String customerName;
    private String panCard;
    private Long aadharNumber;


    public Customer(String customerName, String panCard, Long aadharNumber) {
        this.customerName = customerName;
        this.panCard = panCard;
        this.aadharNumber = aadharNumber;
    }


    public String getCustomerName() {
        return this.customerName;
    }

    public String getPanCard() {
        return this.panCard;
    }

    public Long getAadharNumber() {
        return this.aadharNumber;
    }


    @Override
    public String toString() {
        return "{" +
            " customerName='" + getCustomerName() + "'" +
            ", panCard='" + getPanCard() + "'" +
            ", aadharNumber='" + getAadharNumber() + "'" +
            "}";
    }

}