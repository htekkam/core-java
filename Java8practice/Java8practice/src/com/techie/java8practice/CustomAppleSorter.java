package com.techie.java8practice;

import com.techie.java8practice.entities.Apple;
import com.techie.java8practice.interfaces.Repo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomAppleSorter {
    public static void main(String[] args) {
        List<Apple> data = new ArrayList<>( Repo.getData());
        data
                .sort(Comparator.comparing(Apple::getWeight)
                        .thenComparing(Apple::getColor).reversed());
        System.out.println("data::"+data);

    }
}
