package com.functionalprogramming.predefinedfunctionalinterface03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("functional", "", "Lambda", "Interface", "", "functional-programming");

        // represents boolean condition
        Predicate<String> isEmpty = str -> !str.isEmpty();
        Predicate<String> containsFunc = str -> str.contains("functional");

        // declarative
        List<String> newList1 = filterList(list, isEmpty);
        List<String> newList2 = filterList(list, containsFunc);

        List<Integer> numbers = List.of(34, 41, 33, 56, 71);
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // declarative
        List<Integer> evens = filterList(numbers, isEven);

        System.out.println(newList1);
        System.out.println(newList2);
        System.out.println(evens);

    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();

        for (T item : list) {
            if (predicate.test(item)) newList.add(item);
        }

        return newList;
    }
}
