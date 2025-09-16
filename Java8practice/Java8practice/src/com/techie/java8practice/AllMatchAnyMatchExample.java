package com.techie.java8practice;

import com.techie.java8practice.entities.Dish;
import com.techie.java8practice.interfaces.Repo;

import java.util.function.Predicate;

public class AllMatchAnyMatchExample {
    public static void main(String[] args) {
        Predicate<Dish> vegPredicate = (dish -> dish.isVegetarian());
        boolean areAllDishesVeg = Repo.getDishes().stream()
                .allMatch(vegPredicate);
        System.out.println("areAllDishesVeg");
        System.out.println(areAllDishesVeg);

        boolean isAnyDishisVeg = Repo.getDishes().stream().anyMatch(
                dish -> dish.isVegetarian()
        );
        System.out.println("isAnyDishisVeg");
        System.out.println(isAnyDishisVeg);

    }
}
