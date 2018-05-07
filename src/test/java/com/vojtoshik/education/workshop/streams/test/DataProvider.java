package com.vojtoshik.education.workshop.streams.test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vojtoshik.education.workshop.streams.exercise.model.Person;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProvider {

    public List<Person> getListOfPeople() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File(getClass().getResource("/people.json").getFile());
        JsonNode jsonNode = objectMapper.readTree(file);

        List<Person> result = new ArrayList<>();

        for (Iterator<JsonNode> it = jsonNode.elements(); it.hasNext(); ) {
            JsonNode personNode = it.next();
            result.add(objectMapper.convertValue(personNode, Person.class));
        }

        return result;
    }
}
