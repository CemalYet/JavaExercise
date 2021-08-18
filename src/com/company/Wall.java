package com.company;

public class Wall {

    private String color;
    private boolean isPainted;

    public Wall(String color, boolean isPainted) {
        this.color = color;
        this.isPainted = isPainted;
    }

    public String getColor() {
        return color;
    }

    public boolean isPainted() {
        return isPainted;
    }
}
