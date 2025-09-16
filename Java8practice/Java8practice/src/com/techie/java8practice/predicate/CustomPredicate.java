package com.techie.java8practice.predicate;

import com.techie.java8practice.entities.Apple;
import com.techie.java8practice.interfaces.Repo;

import java.util.function.Predicate;

public class CustomPredicate {
    public static void main(String[] args) {
        Predicate<Apple> redApple = (apple) -> apple.getColor().equalsIgnoreCase("Red");
        Predicate<Apple> redAndHeavyApple = redApple.and((apple)-> apple.getWeight()>150);

        System.out.println("Filtering red and heavy apples");
        Repo.getData().stream()
                .filter(redAndHeavyApple)
                .forEach(System.out::println);

    }
}
