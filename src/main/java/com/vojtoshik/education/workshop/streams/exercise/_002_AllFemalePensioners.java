package com.vojtoshik.education.workshop.streams.exercise;

import com.vojtoshik.education.workshop.streams.exercise.model.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Find a list of all females, who are more than 65 years old and live in Germany
 */
public class _002_AllFemalePensioners implements Exercise<List<Person>> {

    @Override
    public List<Person> solve(List<Person> data) {
        return data.stream()
                .filter(person -> person.getGender().equals("Female"))
                .filter(person -> person.getAge() > 65)
                .filter(person -> person.getCountry().equals("Germany"))
                .collect(Collectors.toList());
    }
}
