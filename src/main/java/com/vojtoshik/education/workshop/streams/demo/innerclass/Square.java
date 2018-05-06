package com.vojtoshik.education.workshop.streams.demo.innerclass;

public class Square implements GeometricalShape {

    private Double sideLength;

    public Square(Double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public Double getPerimeter() {
        return 4 * sideLength;
    }

    @Override
    public Double getArea() {
        return sideLength * sideLength;
    }
}
