package com.techie.java8practice.streams;

import com.techie.java8practice.entities.Apple;
import com.techie.java8practice.entities.Dish;
import com.techie.java8practice.interfaces.Repo;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class SummarizeExample {
    public static void main(String[] args) {

        IntSummaryStatistics statistics = Repo.getData()
                .stream()
                .collect(Collectors.summarizingInt(Apple::getWeight));

        String dishNames = Repo.getDishes().stream()
                .map(Dish::getName).collect(Collectors.joining(","));


        System.out.println("statistics::");
        System.out.println(statistics);

        System.out.println("dishNames::");
        System.out.println(dishNames);

    }
}
