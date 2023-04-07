package com.functionalprogramming.lambdawithdifferentsignature02;

public class MultiStatementLambdaBody04 {
    public static void main(String[] args) {

        StrLenCalc lengthCalc = input -> {
            int l = input.length();
            System.out.println("Length of given string is " + l);
            return l;
        };
        int len = lengthCalc.calculate("Lambda");

        System.out.println(len);

    }
}
