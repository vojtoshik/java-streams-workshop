package com.vojtoshik.education.workshop.streams.demo.innerclass;

public class Circle implements GeometricalShape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }
}
