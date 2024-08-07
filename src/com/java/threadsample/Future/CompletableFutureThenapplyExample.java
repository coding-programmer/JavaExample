package com.java.threadsample.Future;

import java.util.concurrent.CompletableFuture;

/**
 * thenApply - It will transform the output of completable feature. eg. convert the String to Uppercase etc.. multiply Integers
 */
public class CompletableFutureThenapplyExample {

    /**
     * thenapply()example
     * @param args
     */
    public static void main(String[] args) {
        TestClassWithDelay testClass = new TestClassWithDelay();

        CompletableFuture.supplyAsync(testClass::getValuesWithDelay)
                .thenApply((result)->result.replaceAll(",","\\$")) //First Transformation from String replace comma with dollar symbol
                .thenApply((nextResult)->nextResult.replaceAll("\\$","")) //Second Transaction from String replace dollar symbol with empty
                                                                                            //There can be multiple thenapply() because it does transformation
                .thenAccept((output)->{
                    System.out.println(output);  //print the final output
                }).join();

    }
}
