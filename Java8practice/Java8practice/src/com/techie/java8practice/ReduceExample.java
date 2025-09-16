package com.techie.java8practice;

import com.techie.java8practice.entities.Dish;
import com.techie.java8practice.interfaces.Repo;

public class ReduceExample {
    public static void main(String[] args) {
        int sumofCalories = Repo.getDishes().stream()
                .map(Dish::getCalories)
                .reduce(0, (i1,i2)-> i1+i2);
        System.out.println("sumofCalories::"+sumofCalories);
    }
}
