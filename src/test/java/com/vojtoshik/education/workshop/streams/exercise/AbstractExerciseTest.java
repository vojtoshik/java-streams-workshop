package com.vojtoshik.education.workshop.streams.exercise;

import com.vojtoshik.education.workshop.streams.exercise.model.Person;
import com.vojtoshik.education.workshop.streams.test.DataProvider;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.util.List;

public abstract class AbstractExerciseTest {

    private DataProvider dataProvider = new DataProvider();

    protected List<Person> data;

    @BeforeEach
    public void setup() throws IOException {
        data = dataProvider.getListOfPeople();
    }
}
