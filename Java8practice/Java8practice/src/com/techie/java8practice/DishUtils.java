package com.techie.java8practice;

import com.techie.java8practice.entities.Dish;
import com.techie.java8practice.entities.Type;
import com.techie.java8practice.interfaces.Repo;

import java.util.ArrayList;
import java.util.List;

public class DishUtils {

    public static List<Dish> data = Repo.getDishes();
    public static void getTop3DishesWithHighCalories(){
        System.out.println("getTop3DishesWithHighCalories");
        data.stream()
                .filter((dish)-> dish.getCalories()>350)
                .limit(3)
                .forEach(System.out::println);

    }

    public static void printAllVegetarianDishes(){
        System.out.println("printAllVegetarianDishes()");
        data.stream()
                .filter(Dish::isVegetarian)
                .forEach(System.out::println);
    }
    public static void printFirstTwoMeatDishes(){
        System.out.println("printFirstTwoMeatDishes()");
//        data.stream()
//                .filter(dish -> !dish.isVegetarian())
//                .limit(2)
//                .forEach(System.out::println);
        data.stream()
                .filter(dish -> dish.getType()== Type.MEAT)
                .limit(2)
                .forEach(System.out::println);

    }

    public static List<Integer> getAllDishNamesLength(){
        System.out.println("getAllDishNamesLength()");
        return data.stream()
                .map(Dish::getName)
                .map(String::length)
                .toList();
    }

    public static void main(String[] args) {
        getTop3DishesWithHighCalories();
        printAllVegetarianDishes();
        printFirstTwoMeatDishes();

        System.out.println(getAllDishNamesLength());
    }
}
