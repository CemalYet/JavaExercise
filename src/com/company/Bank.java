package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankBranch> branchList;

    public Bank() {
        this.branchList = new ArrayList<BankBranch>();
    }


    public ArrayList<BankBranch> getBranchList() {
        return branchList;
    }

    public boolean addNewBranch(String customerName, Double amount,String branchName){
        if(findBranchByName(branchName)==null) {
            BankBranch bankBranch = new BankBranch(branchName);
            bankBranch.addNewCustomer(customerName, amount);
            this.branchList.add(bankBranch);
            return true;
        }
        System.out.println("Branch name is already exist");
        return false;
    }


    public boolean addTransaction(String customerName, Double amount,String branchName){
        BankBranch branch = findBranchByName(branchName);
        if (branch == null) {
            System.out.println("Branch name does not exist");
            return false;
        }
        branch.addNewTransaction(customerName,amount);
        return true;
    }


    public boolean addNewCustomer(String name,String branchName,Double amount){
        BankBranch branch = findBranchByName(branchName);
        if (branch == null) {
            return false;
        }
        branch.addNewCustomer(name,amount);
        return false;
    }

    public BankBranch findBranchByName(String branchName){
        for (BankBranch branch:this.branchList
        ) {
            if (branch.getBranchName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }
    public void printAll(){
        System.out.println("branch size "+this.branchList.size());
        for (BankBranch branch:this.branchList
        ) {
            branch.printTransactions();
            }
        }
    }


