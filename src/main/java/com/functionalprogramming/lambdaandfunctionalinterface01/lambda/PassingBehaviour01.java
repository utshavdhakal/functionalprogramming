package com.functionalprogramming.lambdaandfunctionalinterface01.lambda;

public class PassingBehaviour01 {
    public static void main(String[] args) {

        Thread th = new Thread(new MyRunnable());
        th.start();

    }
}