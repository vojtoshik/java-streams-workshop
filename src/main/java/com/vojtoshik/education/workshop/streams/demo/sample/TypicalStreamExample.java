package com.vojtoshik.education.workshop.streams.demo.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TypicalStreamExample {

    public static void main(String[] args) throws IOException {

        Path pathToFile = Paths.get("/path/to/file/with.txt");

        Files.lines(pathToFile)
                .flatMap(line -> Stream.of(line.split("\\s+")))
                .filter(line -> line.length() < 10)
                .distinct()
                .count();
    }
}
