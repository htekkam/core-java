package com.techie.java8practice;

import com.techie.java8practice.interfaces.Repo;

import java.util.ArrayList;
import java.util.List;

public class NamesSorter {

    public static void main(String[] args) {

       List<String> sortedNames = new ArrayList<>(Repo.getListOfNames());
       sortedNames.sort(String::compareToIgnoreCase);
        System.out.println("sortedNames");
        System.out.println(sortedNames);

    }
}
