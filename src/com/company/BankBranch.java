package com.company;

import java.util.ArrayList;

public class BankBranch {
    private String branchName;
    private ArrayList<BankCustomer> customer;

    public BankBranch(String branchName) {
        this.branchName = branchName;
        this.customer = new ArrayList<BankCustomer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<BankCustomer> getCustomer() {
        return customer;
    }

    public boolean addNewCustomer(String name,Double amount){
        BankCustomer bankCustomer = new BankCustomer(name);
        bankCustomer.getTransactions().add(amount);
        this.customer.add(bankCustomer);
        System.out.println("new customer added");
        return true;
    }

    public boolean addNewTransaction(String name,Double amount){
        BankCustomer bankCustomer = findCustomerByName(name);
        if (bankCustomer == null) {
            return false;
        }
        bankCustomer.getTransactions().add(amount);
        return true;
    }
     public BankCustomer findCustomerByName(String name){
         for (BankCustomer customer: this.customer
              ) {
             if (customer.getName().equals(name)){
                 return customer;
             }
         }
         System.out.println("Customer name is not found in the list");
         return null;
     }

    public void printTransactions(){
        System.out.println("customer size "+this.customer.size());
        for (BankCustomer customer:this.customer
        ) {
            System.out.println(branchName + "---> "+customer.getName());
            customer.printTransactions();
        }
    }
}
