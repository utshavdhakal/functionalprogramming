package com.functionalprogramming.genericfunctionalinterfaces;

public class SameInputAndReturnType {
    public static void main(String[] args) {

        MyFuncInterface01<String> func = str -> str.substring(1, 5);
        String substring = func.myMethod("Functional");
        System.out.println(substring);
    }
}
