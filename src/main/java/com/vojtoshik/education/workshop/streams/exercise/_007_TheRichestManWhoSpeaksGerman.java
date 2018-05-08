package com.vojtoshik.education.workshop.streams.exercise;

import com.vojtoshik.education.workshop.streams.exercise.model.Person;

import java.util.List;

/**
 * Write code which determines the richest person who speaks German
 */
public class _007_TheRichestManWhoSpeaksGerman implements Exercise<Person> {

    @Override
    public Person solve(List<Person> data) {
        return data.stream()
                .filter(person -> person.getLanguages().contains("German"))
                .reduce(((person1, person2) -> person1.getIncome() > person2.getIncome() ? person1 : person2))
                .orElseThrow(() -> new RuntimeException("Does not exist"));
    }
}
