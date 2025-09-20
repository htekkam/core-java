package com.techie.java8practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {

        String[] inputs = {"hari","krshna","tekkam","vishnu","gunnu"};


        String output = Arrays.stream(inputs)
                .filter(s -> s.length() % 2 == 0)
                .collect(Collectors.joining(","));

        System.out.println("Strings with even length");
        System.out.println(output);


    }
}
