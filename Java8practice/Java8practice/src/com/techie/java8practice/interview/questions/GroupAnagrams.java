package com.techie.java8practice.interview.questions;

import java.util.*;
import java.util.stream.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        Map<String, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));

        System.out.println("grouped");
        System.out.println(grouped);
        grouped.forEach((k, v) -> System.out.println(v));
    }
}
