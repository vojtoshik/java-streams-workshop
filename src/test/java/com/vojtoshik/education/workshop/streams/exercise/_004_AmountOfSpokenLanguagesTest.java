package com.vojtoshik.education.workshop.streams.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _004_AmountOfSpokenLanguagesTest extends AbstractExerciseTest {

    private _004_AmountOfSpokenLanguages sut = new _004_AmountOfSpokenLanguages();

    @Test
    public void testWorksAsExpected() {
        assertEquals(Long.valueOf(97), sut.solve(data));
    }
}