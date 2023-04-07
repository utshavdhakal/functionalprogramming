package com.functionalprogramming.lambdawithdifferentsignature02;

public class SingleInputAndReturn02 {
    public static void main(String[] args) {

        StrLenCalc lengthCalc = input -> input.length();
        int len = lengthCalc.calculate("Lambda");

        System.out.println(len);

    }
}
