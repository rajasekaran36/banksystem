package com.kgisl.basic;

public class App 
{
    public static void main( String[] args )
    {
        Customer aCustomer = new Customer("raja","BPUPX000X",123456789123L);
        BankAccount aBankAccount = new BankAccount(aCustomer, 3633621123456L, 0.0);
        CurrentAccount ca = new CurrentAccount(aBankAccount, 100000.0, 0.0);

        System.out.println(ca.getAccount().getAccountNumber());
        System.out.println(ca.getAccount().getCustomer().getCustomerName());
    }
}
