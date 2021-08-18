package com.company;

public class Car extends Vehicle{

    private String  kind;
    private int gear;


    public Car(double speed, double directionX, double directionY, String kind,int gear) {
        super("Car", "Land", speed, directionX, directionY);
        this.kind = kind;
        this.gear= gear;
    }



    public String getKind() {
        return kind;
    }

    public int getGear() {
        return gear;
    }

    public void changeGear(){
        this.gear+=gear;
    }
    public void steering(){
        System.out.println("Turn the steer");
    }
    public void speedUp(){
        System.out.println("Gas pedals");
    }

    @Override
    public void steering(double directionX, double directionY) {
        steering();
        super.steering(directionX, directionY);
    }

    @Override
    public void speed(double speed) {
        speedUp();
        super.speed(speed);
    }
}
