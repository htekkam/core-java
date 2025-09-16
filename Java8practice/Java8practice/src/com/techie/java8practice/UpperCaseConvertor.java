package com.techie.java8practice;

import com.techie.java8practice.interfaces.Repo;

import java.util.List;
import java.util.function.Consumer;

public class UpperCaseConvertor {

    public static void convertToUpperCase(List<String> names,
                                                  Consumer<String> consumer){
        for(String s:names)
            consumer.accept(s);
    }
    public static void main(String[] args) {
        convertToUpperCase(Repo.getListOfNames(),
                (s) -> System.out.println(s.toUpperCase())
        );
    }
}
