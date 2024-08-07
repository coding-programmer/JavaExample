package com.java.threadsample.Future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestClassWithDelay {

    public String getValuesWithDelay(){
        delayBySec();
        return IntStream.range(0,10).boxed().map(Object::toString).collect(Collectors.joining(","));
    }

    public String processInput(String input){
        delayBySec();
        return IntStream.range(0,10).boxed().map(Object::toString).collect(Collectors.joining(","))+"-"+input;
    }

    public String getValueswithDelay02(){
        delayBySec();
        return TestClassWithDelay.class.getSimpleName(); //Return the className
    }

    public int getValueFive(){
        delayBySec();
        return 5;
    }

    public int getValueTen(){
        delayBySec();
        return 10;
    }

    public void delayBySec(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<String> getClassName (String input){

        return CompletableFuture.supplyAsync( () -> {
            return input+"-"+"Test";
        }) ;

    }
}
