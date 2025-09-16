package com.techie.java8practice.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctCharactersGenerator {
    public static void main(String[] args) {
        List<String> names = List.of("hari","kriishna");
        List<String> collect = names.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("collect::"+collect);

    }
}
