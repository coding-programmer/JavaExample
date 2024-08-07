package com.java.threadsample.Future;

import java.util.concurrent.CompletableFuture;

/**
 * thenCombine - It will combine more than one CompletableFuture's together
 * handle Exception using "exceptionaly"
 */
public class CompletableFutureExceptionallyExample {

    public static void main(String[] args) {

        TestClassWithDelay testClass = new TestClassWithDelay();
        CompletableFuture<String>  firstFuture= CompletableFuture.supplyAsync(testClass::getValuesWithDelay);
        CompletableFuture<String>  secondFuture= CompletableFuture.supplyAsync(testClass::getValueswithDelay02);
        /**
         * Combining Three Integer values 5*10*10.
         * combining more than two future's
         * using "exceptionally" for catching exceptions
         */
        CompletableFuture<Integer> firstInt = CompletableFuture.supplyAsync(testClass::getValueFive);
        CompletableFuture<Integer> secondInt = CompletableFuture.supplyAsync(testClass::getValueTen);
        CompletableFuture<Integer> ThirdInt = CompletableFuture.supplyAsync(testClass::getValueTen);
        firstInt.exceptionally((ex)->{
                    //handle Exception using Exceptionally
                        System.out.println(ex);
                        return 0; //returning Integer value, because the upcoming ".thenCombine(secondInt,(first,second)->first*second)" expects Integer input
                })
                .thenCombine(secondInt,(first,second)->first*second)
                .thenCombine(ThirdInt,(secondoutput,third)->secondoutput*third).thenAccept(System.out::println).join();


    }
}
