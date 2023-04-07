package com.functionalprogramming.lambdaandfunctionalinterface01.lambda;

public class PassingBehaviour03 {
    public static void main(String[] args) {

        Thread th = new Thread(() -> System.out.println("Thread Executed!"));
        th.start();

    }
}