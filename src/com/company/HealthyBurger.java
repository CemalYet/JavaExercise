package com.company;

public class HealthyBurger extends Hamburger{
    private Addition [] addition2;

    public HealthyBurger( String meat, double basePrice, String name) {
        super( "brown rye bread", meat, basePrice, name);
        this.addition2 = new Addition[2];
    }

    public Addition[] getAddition2( ) {
        return addition2;
    }


    public void setAddition2(int number, String name, double price) {
        Addition addition = new Addition(name, price);
        this.addition2[number]= addition;
    }

    @Override
    public double priceOfHamburger(Addition[] addition) {
        Addition [] baseAddition = super.getAddition();
        double healthyBurgerPrice = super.priceOfHamburger(baseAddition);
        System.out.println("Healthy Burger Additions and price:");
        healthyBurgerPrice-=super.getBasePrice();
        healthyBurgerPrice+=super.priceOfHamburger(addition);
        System.out.println("Healthy Burger Total Price : "+healthyBurgerPrice);
        return healthyBurgerPrice;
    }
}
