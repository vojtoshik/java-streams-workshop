package com.vojtoshik.education.workshop.streams.exercise;

import com.vojtoshik.education.workshop.streams.exercise.model.Person;

import java.util.List;

interface Exercise<T> {

    T solve(List<Person> data);
}
