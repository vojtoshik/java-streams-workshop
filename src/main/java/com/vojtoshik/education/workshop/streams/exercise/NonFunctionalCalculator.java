package com.vojtoshik.education.workshop.streams.exercise;

public class NonFunctionalCalculator {

    public static void main(String[] args) {
    }

    private void printSum(Integer a, Integer b) {
        Integer result = a + b;
        System.out.println("Result is: " + result);
    }

    private void printRemainder(Integer a, Integer b) {
        Integer result = a - b;
        System.out.println("Result is: " + result);
    }

    private void printMultiplication(Integer a, Integer b) {
        Integer result = a * b;
        System.out.println("Result is: " + result);
    }
}
