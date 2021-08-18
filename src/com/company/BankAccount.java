package com.company;

public class BankAccount {
    private String costumerName;
    private String email;
    private String accountNumber;
    private double balance;
    private String phoneNumber;

    public BankAccount() {
        this("default Customaer","balak@blank.com","1234435",0,"0884777645");
        System.out.println("this is an empty constructor");
    }

    public BankAccount(String costumerName, String email, String accountNumber, double balance, String phoneNumber) {
        System.out.println("Constructor ith field is called");
        this.costumerName = costumerName;
        this.email = email;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public String getEmail() {
        return email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("added amount is  "+amount+ "\n new balance is " +this.balance );
    }
    public void withdrawFunds(double withdraw){
        if (withdraw > this.balance){
            System.out.println("Insufficient amount of money " + ",current balance is " +this.balance);

        }
        else{
            this.balance-= withdraw;
            System.out.println("withdraw amount is "+withdraw);
            System.out.println("your new balance  after withdrawal is "+ this.balance);
        }
    }
}
