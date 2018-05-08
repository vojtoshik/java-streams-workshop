package com.vojtoshik.education.workshop.streams.exercise;

import com.vojtoshik.education.workshop.streams.exercise.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _002_AllFemalePensionersTest extends AbstractExerciseTest {

    private _002_AllFemalePensioners sut = new _002_AllFemalePensioners();

    @Test
    public void testWorksAsExpected() {
        List<Person> result = sut.solve(data);

        assertEquals(1, result.size());

        Person person = result.stream()
                .findAny()
                .orElseGet(() -> new Person());

        assertEquals("Kora", person.getFirstName());
        assertEquals("Marzelle", person.getLastName());
    }
}