package com.vojtoshik.education.workshop.streams.demo.sorting;

import java.util.*;

public class SortingExample {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listOfIntegers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Integer nextPositiveInt = Math.abs(random.nextInt(100));
            listOfIntegers.add(nextPositiveInt);
        }

        System.out.println("Before sorting: \n" + listOfIntegers.toString());
        Collections.sort(listOfIntegers);
        System.out.println("After sorting: \n" + listOfIntegers.toString());


//        List<HumanBeing> listOfPeople = Arrays.asList(
//                new ConcreteHumanBeing("Albert Einstein", 76, 55),
//                new ConcreteHumanBeing("Max Planck", 89, 63),
//                new ConcreteHumanBeing("Niels Bohr", 77, 80)
//        );
//
//        System.out.println("Before sorting: \n" + listOfPeople + "\n\n");
//        Collections.sort(listOfPeople);
    }
}
