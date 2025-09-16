package com.techie.java8practice.functions;

import java.util.function.Function;

public class CustomFunctionExample {

    public static String addHeader(String message){
        return "From Hari Tekkam,\n"+message;
    }
    public static String footer(String message){
        return message+"\n"+" Regards";
    }

    public static void main(String[] args) {
        Function<String,String> addHeader = CustomFunctionExample::addHeader;
        Function<String,String> addFooter = addHeader.andThen(CustomFunctionExample::footer);
        System.out.println("Adding header");
        System.out.println(addHeader.apply("I am on leave today"));
        System.out.println(addFooter.apply("I am on leave today"));

        String finalMessage = addFooter.apply("I am on leave today");

    }


}
