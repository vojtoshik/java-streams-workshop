package com.vojtoshik.education.workshop.streams.exercise;

import com.vojtoshik.education.workshop.streams.exercise.model.Person;

import java.util.List;

/**
 * Find total number of records using streams
 */
public class _001_NumberOfRecords implements Exercise<Long> {

    @Override
    public Long solve(List<Person> data) {
        return data
                .stream()
                .count();
    }
}
