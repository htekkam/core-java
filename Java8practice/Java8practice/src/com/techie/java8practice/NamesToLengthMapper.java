package com.techie.java8practice;

import com.techie.java8practice.interfaces.Repo;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class NamesToLengthMapper {

    public static void namesToLength(List<String> names,
                              Function<String,Integer> mapper){
        List<Integer> results = new ArrayList<>();
        Map<String, Integer> resultsMap = new HashMap<>();
        for(String s: names){
            results.add(mapper.apply(s));
            resultsMap.put(s,mapper.apply(s));
        }
        System.out.println("results");
        System.out.println(results);
        System.out.println("resultsmap");
        System.out.println(resultsMap);
    }

    public static void main(String[] args) {

        namesToLength(Repo.getListOfNames(),(s -> s.length()));
    }
}
