package com.techie.java8practice.streams;

import com.techie.java8practice.entities.Dish;
import com.techie.java8practice.interfaces.Repo;

import java.util.stream.Collectors;

public class SumUsingReduceExample {
    public static void main(String[] args) {
        Integer collect = Repo.getDishes().stream()
                .collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));

        int totalCalories = Repo.getDishes().stream()
                        .mapToInt(Dish::getCalories)
                                .sum();
        System.out.println("Total calories::"+collect.intValue());
        System.out.println("Total calories with sum method::"+totalCalories);
    }
}
