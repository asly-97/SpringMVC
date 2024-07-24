package com.revature.SpringMVCDemo.model;

public class Movie {
    private int id;
    private String name;
    private String releaseDate;
    private float duration;

    public Movie(int id, String name, String releaseDate, float duration) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public float getDuration() {
        return duration;
    }
}
