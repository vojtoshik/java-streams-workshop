package com.vojtoshik.education.workshop.streams.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _006_OldestPeopleNamesTest extends AbstractExerciseTest {

    private _006_OldestPeopleNames sut = new _006_OldestPeopleNames();

    @Test
    public void testWorksAsExpected() {
        String result = sut.solve(data);
        assertEquals(
                "Dasi Prestner: 85 years, Sarine Old: 85 years, Ashton Easbie: 85 years, Prentice Leteurtre: " +
                        "85 years, Gena Astles: 85 years, De witt Hrachovec: 85 years, Piggy Di Lucia: 85 years, " +
                        "Cari Ham: 85 years, Raf Appleton: 84 years, Lindy Sole: 84 years",
                result
        );
    }
}