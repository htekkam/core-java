package com.techie.java8practice.problems;

import java.util.Arrays;
import java.util.List;

public class FirstSquareDivByThreeExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,6,9);
        numbers.stream()
                .map(integer -> integer*integer)
                .filter(integer -> integer % 3 ==0)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
