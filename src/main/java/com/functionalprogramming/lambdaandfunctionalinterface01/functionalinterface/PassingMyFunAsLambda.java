package com.functionalprogramming.lambdaandfunctionalinterface01.functionalinterface;

public class PassingMyFunAsLambda {
    public static void main(String[] args) {

        randomMethod(() -> System.out.println("Hello!!"));

    }

    private static void randomMethod(MyFunInterface fun) {
        fun.myMethod();
    }
}
