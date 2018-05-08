package com.vojtoshik.education.workshop.streams.exercise;

import com.vojtoshik.education.workshop.streams.exercise.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a code which returns a string, that contains TOP10 oldest people in the following format:
 *
 * Cari Ham: 85 years, Raf Appleton: 84 years, Lindy Sole: 84 years
 */
public class _006_OldestPeopleNames implements Exercise<String> {

    @Override
    public String solve(List<Person> data) {
        return data.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .limit(10)
                .map(person -> person.getFirstName() + " " + person.getLastName() + ": " + person.getAge() + " years")
                .collect(Collectors.joining(", "));
    }
}
