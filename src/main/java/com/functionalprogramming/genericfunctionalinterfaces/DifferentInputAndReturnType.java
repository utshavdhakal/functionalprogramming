package com.functionalprogramming.genericfunctionalinterfaces;

public class DifferentInputAndReturnType {
    public static void main(String[] args) {

        MyFuncInterface02<String, Integer> func = str -> str.length();
        int len = func.myMethod("Functional");
        System.out.println(len);
    }
}
