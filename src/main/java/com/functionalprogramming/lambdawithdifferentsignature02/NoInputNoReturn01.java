package com.functionalprogramming.lambdawithdifferentsignature02;

public class NoInputNoReturn01 {
    public static void main(String[] args) {

        MyFuncInterface impl = () -> System.out.println("Something");
        impl.myMethod();

    }
}
