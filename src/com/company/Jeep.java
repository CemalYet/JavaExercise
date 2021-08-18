package com.company;

public class Jeep extends Car{


    private int door;
    private String model;

    public Jeep(double speed, double directionX, double directionY,  int door, String model) {
        super(speed, directionX, directionY,"Jeep",5);

        this.door = door;
        this.model = model;
    }



    public int getDoor() {
        return door;
    }

    public String getModel() {
        return model;
    }
}
