package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("DefaulVip",100,"default@default.com");
        System.out.println("Empty constructor");
    }

    public VipCustomer(String name, String emailAddress) {
        this( name,120,emailAddress);
        System.out.println("Constructor with two parameters");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        System.out.println("\nNormal constructor");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
