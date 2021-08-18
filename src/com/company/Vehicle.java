package com.company;

public class Vehicle {
    private String name;
    private String type;
    private double speed;
    private double directionX;
    private double directionY;

    public Vehicle(String name, String type, double speed, double directionX, double directionY) {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.directionX = directionX;
        this.directionY = directionY;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirectionX() {
        return directionX;
    }

    public double getDirectionY() {
        return directionY;
    }

    public void steering(double directionX, double directionY){
        System.out.println("Steering from Vehicle class");
        this.directionX+=directionX;
        this.directionY+=directionY;
    }

    public void speed(double speed){
        System.out.println("Speed from Vehicle class");
        this.speed+=speed;
    }
}
