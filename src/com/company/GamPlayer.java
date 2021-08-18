package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GamPlayer implements GameSave {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public GamPlayer(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public double getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public List<String> save() {
        ArrayList<String> players = new ArrayList<>();
        players.add(0,this.name);
        players.add(1, "" + this.hitPoints);
        players.add(2, "" + this.strength);
        players.add(3, this.weapon);
        return players;


    }

    @Override
    public void saveParameter(List<String> values) {
        if (values.size()>0){
            this.name = values.get(0);
            this.hitPoints= Integer.parseInt(values.get(1));
            this.strength= Integer.parseInt(values.get(2));
            this.weapon= values.get(3);
        }

    }

    @Override
    public String toString() {
        return "GamPlayer{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
