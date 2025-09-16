package com.techie.java8practice;

public class LambdaTypeChecker {

    private static int age =50;

    public static void typeChecker(){
        int localVariable = 99;

        System.out.println("typeChecker()");
        Runnable r = ()-> System.out.println("my age is ::"+age);
        Runnable r1 = ()-> System.out.println("local age::"+localVariable);
       // localVariable=100;
        r1.run();
        r.run();
    }
    public static void main(String[] args) {
        typeChecker();
    }
}
