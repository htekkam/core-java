package com.techie.java8practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamsDemo {
    public static void main(String[] args) {
        IntStream evenNumbers = IntStream.rangeClosed(11,20)
                .filter(i-> i%2 ==0);

        long totalEvenNumbers = evenNumbers.count();
        System.out.println("Total even numbers::"+totalEvenNumbers);

        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a ->
                                IntStream.rangeClosed(a, 100)
                                        .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
                                        .mapToObj(b ->
                                                new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
                        );
        pythagoreanTriples.limit(5)
                .forEach(t ->
                        System.out.println(t[0] + ", " + t[1] + ", " + t[2]));
    }
}
