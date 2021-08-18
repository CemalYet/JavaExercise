package com.company;

public class Windows {

    private int amount;
    private String type;

    public Windows(int amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public void constructWindow(){
        getAmount();
        getType();

    }

    private int getAmount() {
        System.out.println("the room has "+amount+" window");
        return amount;
    }

   private String getType() {
       System.out.println("the type of windows is "+type);
        return type;
    }
}
