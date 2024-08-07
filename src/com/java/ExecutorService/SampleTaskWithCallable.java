package com.java.ExecutorService;

import java.util.Date;
import java.util.concurrent.Callable;

public class SampleTaskWithCallable implements Callable<String> {

    private String name;

    public SampleTaskWithCallable(String name){
        this.name=name;
    }

    @Override
    public String call() throws Exception {
        return name+"-"+(new Date().toString());
    }
}
