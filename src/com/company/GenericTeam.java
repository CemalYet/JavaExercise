package com.company;

public abstract class  GenericTeam implements Comparable<GenericTeam>  {
    private String name;
    private int point;

    public GenericTeam(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public int compareTo(GenericTeam o) {
        if (this.point > o.getPoint()){
            return -1;
        }else if(this.point < o.getPoint()){
            return 1;
        }else{
            return 0;
        }
    }
}
