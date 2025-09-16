package com.techie.java8practice;

import com.techie.java8practice.entities.Dish;
import com.techie.java8practice.interfaces.Repo;

import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {

        Optional<Dish> anyVegDish = Repo.getDishes().stream()
                .filter(Dish::isVegetarian)
                .findAny();

        anyVegDish.ifPresent(
                dish -> System.out.println(dish.getName())
        );

    }
}
