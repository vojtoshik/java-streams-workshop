package com.vojtoshik.education.workshop.streams.exercise;

import com.vojtoshik.education.workshop.streams.exercise.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a code which returns a list of languages in alphabetical order spoken by TOP6-10 richest people
 */
public class _005_LanguagesSpokenByRichestPeople implements Exercise<List<String>> {

    @Override
    public List<String> solve(List<Person> data) {
        return data.stream()
                .sorted(Comparator.comparing(Person::getIncome).reversed())
                .limit(10)
                .skip(5)
                .flatMap(person -> person.getLanguages().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
