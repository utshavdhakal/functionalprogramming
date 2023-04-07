package com.functionalprogramming.lambdawithdifferentsignature02;

public class MultipleInputNoReturn03 {
    public static void main(String[] args) {


        MathOperation add = (a, b) -> System.out.println(a + b);
        MathOperation power = (a, b) -> System.out.println(Math.pow(a, b));

        add.operation(10, 30);
        power.operation(5, 4);


    }
}
