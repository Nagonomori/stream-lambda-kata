package com.github.jorgenringen.lambda.stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Util {

    public static List<String> mapToUppercase(List<String> input) {
        return input.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

    public static List<String> removeElementsWithMoreThanFourCharacters(List<String> input) {
        return null;    }

    public static List<String> sortStrings(List<String> input) {
        return null;    }

    public static List<Integer> sortIntegers(List<String> input) {
        return null;    }

    public static List<Integer> sortIntegersDescending(List<String> input) {
        return null;    }

    public static Integer sum(List<Integer> numbers) {
        return null;    }

    public static List<String> flattenToSingleCollection(List<List<String>> input) {
        return null;
    }

    public static String separateNamesByComma(List<Person> input) {
        return null;    }

    public static String findNameOfOldestPerson(List<Person> input) {
        return null;    }

    public static List<String> filterPeopleLessThan18YearsOld(List<Person> input) {
        return null;    }

    public static IntSummaryStatistics getSummaryStatisticsForAge(List<Person> input) {
        return null;    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> input) {
        return null;    }

    public static Map<String, List<Person>> partitionByNationality(List<Person> input) {
        return null;    }
}
