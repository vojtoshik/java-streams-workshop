package com.vojtoshik.education.workshop.streams.exercise;

import com.vojtoshik.education.workshop.streams.exercise.model.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Return a unique list of all countries in alphabetical order represented in data set
 */
public class _003_ListOfAllCountries implements Exercise<List<String>> {

    @Override
    public List<String> solve(List<Person> data) {
        return data.stream()
                .map(Person::getCountry)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
