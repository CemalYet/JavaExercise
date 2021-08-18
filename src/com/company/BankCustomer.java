package com.company;

import java.util.ArrayList;

public class BankCustomer {
    private String name;
    private ArrayList<Double> transactions;

    public BankCustomer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void printTransactions(){
        for (Double transaction:this.transactions
        ) {
            System.out.println(name + "---> "+transaction);
        }
    }
}
