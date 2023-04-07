package com.functionalprogramming.lambdaandfunctionalinterface01.functionalinterface;

public class UsingMyFunWithLambda {
    public static void main(String[] args) {


        MyFunInterface impl = () -> System.out.println("Hello!");
        impl.myMethod();

    }
}
