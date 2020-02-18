package com.kgisl.basic;

//Association
public class CurrentAccount{
    BankAccount account;
    Double overDraftLimit;
    Double currentCredit;

    public CurrentAccount(BankAccount account, Double overDraftLimit, Double currentCredit) {
        this.account = account;
        this.overDraftLimit = overDraftLimit;
        this.currentCredit = currentCredit;
    }

    public BankAccount getAccount() {
        return this.account;
    }

    public Double getOverDraftLimit() {
        return this.overDraftLimit;
    }

    public Double getCurrentCredit() {
        return this.currentCredit;
    }

}