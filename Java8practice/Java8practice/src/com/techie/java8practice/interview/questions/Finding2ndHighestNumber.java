package com.techie.java8practice.interview.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Finding2ndHighestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,77,77,8,9};
        Optional<Integer> i = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(i.orElse(null));




    }
}
