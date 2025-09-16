package com.techie.java8practice;

import com.techie.java8practice.interfaces.Repo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NonEmptyNames {

    public static <T> List<T> filter(List<T> namesList, Predicate<T> predicate){

        List<T> results = new ArrayList<>();
        for(T s : namesList){
            if(predicate.test(s))
                results.add(s);

        }
    return results;
    }
    public static void main(String[] args) {
        Predicate<String> nonEmptyPredicate = (t) -> !t.isEmpty();
        List<String> nonEmptyStrings = filter(Repo.getListOfNames(), nonEmptyPredicate);
        System.out.println("Non empty strings");
        System.out.println(nonEmptyStrings);

    }
}
