package com.techie.java8practice.problems;

import java.util.List;

public class SquaresGenerator {
    public static void main(String[] args) {
        List<Integer> input = List.of(1,2,3,4,5,6);
        List<Integer> squares = input.stream()
                .map(n-> n*n)
                .toList();
        System.out.println(input);
        System.out.println(squares);
    }
}
