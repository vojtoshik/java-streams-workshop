package com.vojtoshik.education.workshop.streams.demo.sorting;

public class ConcreteHumanBeing implements HumanBeing {

    private final String name;
    private Integer age;
    private final Integer weight;

    public ConcreteHumanBeing(String name, Integer age, Integer weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public Integer getWeightInGrams() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("[name=%s, age=%d, weight=%d]", name, age, weight);
    }
}
