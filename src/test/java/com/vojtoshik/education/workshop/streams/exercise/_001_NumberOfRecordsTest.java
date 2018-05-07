package com.vojtoshik.education.workshop.streams.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _001_NumberOfRecordsTest extends AbstractExerciseTest {

    private _001_NumberOfRecords sut = new _001_NumberOfRecords();

    @Test
    public void testWorksAsExpected() {
        assertEquals(Long.valueOf(1000), sut.solve(data));
    }
}