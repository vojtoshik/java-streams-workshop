package com.vojtoshik.education.workshop.streams.exercise;

import com.vojtoshik.education.workshop.streams.exercise.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _007_TheRichestManWhoSpeaksGermanTest extends AbstractExerciseTest {

    private _007_TheRichestManWhoSpeaksGerman sut = new _007_TheRichestManWhoSpeaksGerman();

    @Test
    public void testWorksAsExpected() {
        Person result = sut.solve(data);

        assertEquals("Rafe", result.getFirstName());
        assertEquals("Rankin", result.getLastName());
    }
}