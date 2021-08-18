package com.company;

public class Hamburger {
    private String rollType;
    private String meat;
    private double basePrice;
    private String name;
    private Addition [] addition;

    public Hamburger(String rollType, String meat, double basePrice,String name) {
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.name = name;
        this.addition = new Addition[4];
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public Addition[] getAddition() {
        return this.addition;
    }

    public void setAddition(int number, String name, double price) {
        Addition addition = new Addition(name, price);
        this.addition[number]= addition;
    }

    public double priceOfHamburger(Addition[] addition){
        double hamburgerPrice = this.basePrice;
        for(int i=0;i<addition.length;i++){
            if (addition[i] != null) {
                System.out.println((i+1)+"-"+addition[i].getName()+"->"+addition[i].getPrice());
                hamburgerPrice+=addition[i].getPrice();
            }

        }
        System.out.println("Base hamburger total price "+hamburgerPrice);
        System.out.println("=====================");
        return hamburgerPrice;
    }
}
