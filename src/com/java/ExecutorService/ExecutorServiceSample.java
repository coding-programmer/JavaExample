package com.java.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceSample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for(int i=0;i<10;i++) {
            Runnable rs = new SampleTask(""+i);
            service.submit(rs);
        }
        service.shutdown();
    }
}
