package com.github.jorgenringen.lambda.stream;

import java.util.*;

public class Util {
    private Util() {

    }

    public static List<String> mapToUppercase(List<String> input) {
        ArrayList<String> strings = new ArrayList<>();
        for (String s : input) {
            strings.add(s.toUpperCase());
        }
        return strings;
    }

    public static List<String> removeElementsWithMoreThanFourCharacters(List<String> input) {
        ArrayList<String> strings = new ArrayList<>();
        for (String s : input) {
            if (s.length() < 4) {
                strings.add(s);
            }
        }
        return strings;
    }

    public static List<String> sortStrings(List<String> input) {
        String[] strings = input.toArray(input.toArray(new String[0]));
        Arrays.sort(strings);
        return Arrays.asList(strings);
    }

    public static List<Integer> sortIntegers(List<String> input) {
        Integer[] integers = new Integer[input.size()];
        int i = 0;
        for (String s : input) {
            integers[i] = Integer.parseInt(s);
            i++;
        }
        Arrays.sort(integers);
        return Arrays.asList(integers);
    }

    public static List<Integer> sortIntegersDescending(List<String> input) {
        Integer[] integers = new Integer[input.size()];
        int i = 0;
        for (String s : input) {
            integers[i] = Integer.parseInt(s);
            i++;
        }
        Arrays.sort(integers, Comparator.reverseOrder());
        return Arrays.asList(integers);
    }

    public static Integer sum(List<Integer> numbers) {
        Integer i = 0;
        for (Integer number : numbers) {
            i += number;
        }
        return i;
    }

    public static List<String> flattenToSingleCollection(List<List<String>> input) {
        ArrayList<String> strings = new ArrayList<>();
        for (List<String> list : input) {
            strings.addAll(list);
        }
        return strings;
    }

    public static String separateNamesByComma(List<Person> input) {
        StringBuilder line = new StringBuilder("Names: ");
        for (Person p : input) {
            line.append(p.getName()).append(", ");
        }
        line = new StringBuilder(line.substring(0, line.length() - 2) + ".");
        return line.toString();
    }

    public static String findNameOfOldestPerson(List<Person> input) {
        Person oldest = input.get(0);
        for (Person p : input) {
            if (p.getAge() > oldest.getAge()) {
                oldest = p;
            }
        }
        return oldest.getName();
    }

    public static List<String> filterPeopleLessThan18YearsOld(List<Person> input) {
        ArrayList<String> kids = new ArrayList<>();
        for (Person p : input) {
            if (p.getAge() < 18) {
                kids.add(p.getName());
            }
        }
        return kids;
    }

    public static IntSummaryStatistics getSummaryStatisticsForAge(List<Person> input) {
        IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();
        for (Person p : input) {
            intSummaryStatistics.accept(p.getAge());
        }

        return intSummaryStatistics;
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> input) {
        HashMap<Boolean, List<Person>> map = new HashMap<>();
        ArrayList<Person> adultList = new ArrayList<>();
        ArrayList<Person> kidList = new ArrayList<>();
        for (Person p : input) {
            if (p.getAge() >= 18) {
                adultList.add(p);
            } else {
                kidList.add(p);
            }
        }
        map.put(true, adultList);
        map.put(false, kidList);
        return map;
    }

    public static Map<String, List<Person>> partitionByNationality(List<Person> input) {
        HashMap<String, List<Person>> map = new HashMap<>();
        for (Person p : input) {
            String country = p.getCountry();
            if (map.containsKey(country)) {
                List<Person> people = map.get(country);
                people.add(p);
                map.put(country, people);
            } else {
                ArrayList<Person> people = new ArrayList<>();
                people.add(p);
                map.put(country, people);
            }
        }
        return map;
    }
}
