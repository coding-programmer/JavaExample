package com.java.CompletableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * thenCompose will convert one format data to another format if its "return" is completableFuture.
 * where as thenapply will return a value instead of CompletableFeature
 */
public class CompletableFuturethenComposeExample {

    public static void main(String[] args) {

        TestClassWithDelay testClass = new TestClassWithDelay();

        CompletableFuture<String>  getStringValues = CompletableFuture.supplyAsync(testClass::getValuesWithDelay);
        getStringValues.thenCompose( //Accept parameter from firstFuture (getStringValues) output
                (value) -> testClass.getClassName(value)).
                thenAccept((output) -> System.out.println(output)).join();
    }

}
