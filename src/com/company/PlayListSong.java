package com.company;

public class PlayListSong {
    private String name;
    private double duration;

    public PlayListSong(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

}
