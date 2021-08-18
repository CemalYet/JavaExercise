package com.company;

public class Room {
    private Table theTable;
    private Windows theWindow;
    private Wall theWall;

    public Room(Table theTable, Windows theWindow, Wall theWall) {
        this.theTable = theTable;
        this.theWindow = theWindow;
        this.theWall = theWall;
    }

    public void constructRoom(){
        theTable.constructTable();
        System.out.println("the wall is "+getTheWall().getColor()+" color "
        +getTheWall().isPainted());
        theWindow.constructWindow();

    }

    private Table getTheTable() {
        return theTable;
    }

   private Windows getTheWindow() {
        return theWindow;
    }

    public Wall getTheWall() {
        return theWall;
    }
}
