package com.company;

public class DeluxeBurger extends Hamburger {


    public DeluxeBurger() {
        super("white", "Bacon", 15, "Deluxe Burger");
        super.setAddition(0,"chips",0.95);
        super.setAddition(1,"drink",1.90);
    }

    public double priceOfHamburger() {
        return super.priceOfHamburger(super.getAddition());
    }

}
