package com.company;

public class Table {

    private String type;
    private double width;
    private double height;

    public Table(String type, double width, double height) {
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public void constructTable(){
        System.out.println("The table type is "+ type
                +" ,the width is "+width+",the height "+height);

    }

}
