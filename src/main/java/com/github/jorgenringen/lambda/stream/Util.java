package com.github.jorgenringen.lambda.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Util {

    public static List<String> mapToUppercase(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> removeElementsWithMoreThanThreeCharacters(List<String> input) {
        return input.stream()
                .filter(s -> s.length() <= 3)
                .collect(Collectors.toList());
    }

    public static List<String> sortStrings(List<String> input) {
        return input.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> sortIntegers(List<String> input) {
        return input.stream()
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> sortIntegersDescending(List<String> input) {
        return input.stream()
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    public static List<String> flattenToSingleCollection(List<List<String>> input) {
        return input.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public static String separateNamesByComma(List<Person> input) {
        return input.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", ", "Names: ", "."));
    }

    public static String findNameOfOldestPerson(List<Person> input) {
        return input.stream()
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .orElse("");
    }

    public static List<String> filterPeopleLessThan18YearsOld(List<Person> input) {
        return input.stream()
                .filter(p -> p.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public static IntSummaryStatistics getSummaryStatisticsForAge(List<Person> input) {
        return input.stream()
        .collect(Collectors.summarizingInt(Person::getAge));
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> input) {
        return input.stream()
                .collect(Collectors.groupingBy(p -> p.getAge() >= 18));
    }

    public static Map<String, List<Person>> partitionByNationality(List<Person> input) {
        return input.stream()
                .collect(Collectors.groupingBy(Person::getCountry));
    }
}
