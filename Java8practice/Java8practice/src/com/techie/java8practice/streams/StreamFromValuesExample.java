package com.techie.java8practice.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromValuesExample {
    public static void main(String[] args) {

        System.out.println("creating stream with values");
        Stream<String> stream = Stream.of("hari","krishna","tekkam");
        stream.forEach(System.out::println);

        System.out.println("Stream from arrays");
        int[] evenNumbers  = {2,4,6,8,10};
        Arrays.stream(evenNumbers).forEach(System.out::println);
        int sum = Arrays.stream(evenNumbers).sum();
        System.out.println("sum of even integers::"+sum);

    }
}
