package com.techie.java8practice.entities;

public class Dish {
    private final String name;
    private final int calories;
    private final boolean vegetarian;
    private final Type type;
    private final int price;

    public Dish(String name, int calories, boolean vegetarian, Type type, int price) {
        this.name = name;
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public Type getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", vegetarian=" + vegetarian +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
