package com.techie.java8practice.interview.questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] input = {11,11,2,5,99,8,55,2};

        Set<Integer> original = new HashSet<>();
        Set<Integer> duplicate = Arrays.stream(input)
                .filter(n-> !original.add(n))
                .boxed()
                .collect(Collectors.toSet());

        System.out.println("duplicate::");
        System.out.println(duplicate);

        System.out.println("Finding first non repeated character");
        String name = "harikrishnatekkam";

        name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);


    }
}
