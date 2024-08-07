package com.java.ExecutorService;

import java.util.Date;

public class SampleTask implements Runnable{

    public String taskName;
    public SampleTask(String name){
        this.taskName=name;
    }

    public void run(){
        System.out.println("Sample Task"+new Date());
    }
}
