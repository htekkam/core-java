package com.techie.java8practice.functions;

import java.util.function.Function;

public class FunctionComposeExample {
    public static void main(String[] args) {
        Function<Integer,Integer> f= (x)-> x+1;
        Function<Integer,Integer> g = (x)-> x*x;
        Function<Integer,Integer> h = f.andThen(g);
        int result1 = h.apply(5);
        System.out.println("result1::"+result1);

        Function<Integer,Integer> y = f.compose(g);
        int result2 = y.apply(5);
        System.out.println("result2::"+result2);
    }
}
