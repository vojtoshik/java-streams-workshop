package com.vojtoshik.education.workshop.streams.demo.sample;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

@SuppressWarnings("ALL")
public class StreamCreationDemo {

    public Stream<String> streamFromArray() {
        String[] names = { "Bruno", "Leo", "Daniel" };
        return Stream.of(names); // same as: Stream.of("Bruno", "Leo", "Daniel")
    }

    public Stream<City> streamFromCollection() {
        List<City> listOfCities = new ArrayList<>();

        listOfCities.add(City.of("Berlin"));
        listOfCities.add(City.of("Rome"));
        listOfCities.add(City.of("Kyiv"));

        return listOfCities.stream();
    }

    public Stream<Character> streamFromGenerator() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return Stream.generate(() -> {
            Integer position = ThreadLocalRandom.current().nextInt(alphabet.length());
            return alphabet.charAt(position);
        });
    }

    public Stream<BigInteger> streamFromIterator() {
        return Stream.iterate(
                BigInteger.ONE,
                (previous) -> previous.multiply(BigInteger.valueOf(2))
        );
    }

    public Stream<String> streamFromApiMethod() throws IOException {
        Path pathToFile = Paths.get("/etc/passwd");
        return Files.lines(pathToFile);
    }
}
