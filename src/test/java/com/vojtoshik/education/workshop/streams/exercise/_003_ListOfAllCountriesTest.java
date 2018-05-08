package com.vojtoshik.education.workshop.streams.exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _003_ListOfAllCountriesTest extends AbstractExerciseTest {

    private _003_ListOfAllCountries sut = new _003_ListOfAllCountries();

    @Test
    public void testWorksAsExpected() {
        List<String> result = sut.solve(data);

        assertEquals(11, result.size());
        assertEquals(
                Arrays.asList("Brazil", "Egypt", "Germany", "Hungary", "Italy", "Romania", "Russia", "Spain", "Ukraine",
                        "United Kingdom", "United States"),
                result
        );
    }
}