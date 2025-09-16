package com.techie.java8practice;

import com.techie.java8practice.entities.Apple;
import com.techie.java8practice.interfaces.Repo;

import java.util.List;
import java.util.function.Predicate;

public class ApplesByColorFilter {

    public static void main(String[] args) {

        String color = "green";

        //defining a predicate to filter red apples

        Predicate<Apple> redPredicate = (apple) -> apple.getColor().equals("red");

        List<Apple> greenApples = Repo.getData()
                .stream()
                .filter((apple -> apple.getColor().equals(color)))
                .toList();
        System.out.println("Green apples");
        System.out.println(greenApples);
        System.out.println("Red apples by applying predicate");

        Repo.getData().stream()
                .filter(redPredicate)
                .forEach(System.out::println);

        System.out.println("Runnable example");
        Runnable r = () -> System.out.println("This is example of runnable");
        r.run();
    }
}
