package com.vojtoshik.education.workshop.streams.exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _005_LanguagesSpokenByRichestPeopleTest extends AbstractExerciseTest {

    private _005_LanguagesSpokenByRichestPeople sut = new _005_LanguagesSpokenByRichestPeople();

    @Test
    public void testWorksAsExpected() {
        List<String> result = sut.solve(data);
        assertEquals(16, result.size());
        assertEquals(
                Arrays.asList(
                        "Bengali", "Bosnian", "German", "Hungarian", "Icelandic", "Japanese", "Lithuanian", "Malay",
                        "Māori", "Nepali", "New Zealand Sign Language", "Norwegian", "Oriya", "Portuguese", "Telugu",
                        "Yiddish"
                ),
                result
        );
    }
}