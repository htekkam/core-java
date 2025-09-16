package com.techie.java8practice.interfaces;

import com.techie.java8practice.entities.Apple;
import com.techie.java8practice.entities.Dish;
import com.techie.java8practice.entities.Type;

import java.util.List;

public class Repo {



    public static List<Apple>  getData(){
         List<Apple> data =
                List.of(new Apple("red",150),
                        new Apple("green",40),
                        new Apple("red",40),
                        new Apple("green",70),
                        new Apple("red",55),
                        new Apple("green",100),
                        new Apple("red",200),
                        new Apple("green",58),
                        new Apple("red",160),
                        new Apple("green",250),
                        new Apple("red",210),
                        new Apple("green",40),
                        new Apple("red",80),
                        new Apple("green",90));
        return data;
    }

    public static List<String> getListOfNames(){
        return List.of("Hari",
                "Vishnu",
                "Gunnu",
                "Ramu",
                "Harris",
                "Prince",
                "Diana",
                "Chrisopher Nolan",
                "");
    }

    public static List<Dish> getDishes(){
        return List.of(
                new Dish("paneer butter",100,true, Type.OTHER,320),
                new Dish("veg fried rice",200,true, Type.OTHER,220),
                new Dish("chicken tikka",300,false, Type.MEAT,280),
                new Dish("chicken 65",180,false, Type.MEAT,120),
                new Dish("green salad",50,true, Type.OTHER,90),
                new Dish("paneer tikka",200,true, Type.OTHER,170),
                new Dish("appolo fish",400,false, Type.FISH,310),
                new Dish("fish masala",300,false, Type.FISH,240),
                new Dish("dum biriyani",250,true, Type.OTHER,225),
                new Dish("chicken biriyani",320,false, Type.MEAT,199),
                new Dish("fry piece biriyani",300,false, Type.MEAT,199),
                new Dish("butter chicken",400,false, Type.MEAT,420),
                new Dish("butter naan",500,true, Type.OTHER,60));


    }

}
