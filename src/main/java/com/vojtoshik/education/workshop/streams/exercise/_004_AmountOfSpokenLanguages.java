package com.vojtoshik.education.workshop.streams.exercise;

import com.vojtoshik.education.workshop.streams.exercise.model.Person;

import java.util.List;

/**
 * Calculate a number of languages spoken
 */
public class _004_AmountOfSpokenLanguages implements Exercise<Long> {

    @Override
    public Long solve(List<Person> data) {
        return data.stream()
                .flatMap(person -> person.getLanguages().stream())
                .distinct()
                .count();
    }
}
