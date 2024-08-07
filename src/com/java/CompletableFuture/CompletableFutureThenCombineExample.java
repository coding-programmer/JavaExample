package com.java.CompletableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * thenCombine - It will combine more than one CompletableFuture's together
 */
public class CompletableFutureThenCombineExample {

    public static void main(String[] args) {

        TestClassWithDelay testClass = new TestClassWithDelay();
        CompletableFuture<String>  firstFuture= CompletableFuture.supplyAsync(testClass::getValuesWithDelay);
        CompletableFuture<String>  secondFuture= CompletableFuture.supplyAsync(testClass::getValueswithDelay02);

        /**
         * combining two futures
         */
        firstFuture.thenCombine(   //has two arguments, first argument will accept the target (next) completion stage, here it is second future
                secondFuture, (first,second) -> first+second) //Second argument is bifunction will decide what need to be done with first and second argument, here we are combining
                .thenAccept(System.out::println).join();

        /**
         * Combining Three Integer values 5*10*10.
         * combining more than two future's
         * using "handle" for catching exceptions
         */
        CompletableFuture<Integer> firstInt = CompletableFuture.supplyAsync(testClass::getValueFive);
        CompletableFuture<Integer> secondInt = CompletableFuture.supplyAsync(testClass::getValueTen);
        CompletableFuture<Integer> ThirdInt = CompletableFuture.supplyAsync(testClass::getValueTen);
        firstInt.handle((result,ex)->{
                    //handle Exception
                    if(ex!=null){
                        System.out.println(ex);
                        return null;
                    }else {
                        return result;  //return the actual result from line number 30
                    }

                })
                .thenCombine(secondInt,(first,second)->first*second)
                .thenCombine(ThirdInt,(secondoutput,third)->secondoutput*third).thenAccept(System.out::println).join();


    }
}
