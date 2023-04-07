package com.functionalprogramming.lambdaandfunctionalinterface01.lambda;

public class PassingBehaviour02 {
    public static void main(String[] args) {

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Executed!");
            }
        });
        th.start();

    }
}