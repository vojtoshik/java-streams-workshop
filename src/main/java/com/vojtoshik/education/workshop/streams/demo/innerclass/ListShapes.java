package com.vojtoshik.education.workshop.streams.demo.innerclass;

import java.util.ArrayList;
import java.util.List;

public class ListShapes {

    public static void main(String[] args) {
        List<GeometricalShape> listOfShapes = new ArrayList<>();

        listOfShapes.add(new Square(10.1));
        listOfShapes.add(new Square(167.8));
        listOfShapes.add(new Circle(17.8));
        listOfShapes.add(new Circle(121.5));

        printShapes(listOfShapes);
    }

    private static void printShapes(List<GeometricalShape> listOfShapes) {

        for (GeometricalShape shape : listOfShapes) {

            String message = String.format(
                    "I am: %s, my perimeter is: %.2f, my area is: %.2f",
                    shape.getName(),
                    shape.getPerimeter(),
                    shape.getArea()
            );

            System.out.println(message);
        }
    }
}
