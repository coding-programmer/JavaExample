package com.java.CompletableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * CompletableFuture Example
 */
public class CompletableFutureExample {

    public static void main(String[] args) {

        TestClassWithDelay testClass = new TestClassWithDelay();

        CompletableFuture.supplyAsync(()-> //This is an async call
           testClass.getValuesWithDelay() //This is to call the Method for processing by Async
        ).thenAccept(output -> {
            System.out.print(output); //This Method is to Print the output of getValuesWithDelay() method
        }).join(); //This is to wait the main thread and print the DelayMethod1
    }
}
