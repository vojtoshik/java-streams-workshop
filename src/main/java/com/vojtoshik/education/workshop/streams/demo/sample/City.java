package com.vojtoshik.education.workshop.streams.demo.sample;

public class City {

    private String name;

    public static City of(String name) {
        return new City(name);
    }

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
