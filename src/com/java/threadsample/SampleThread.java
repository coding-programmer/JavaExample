package com.java.threadsample;

public class SampleThread extends Thread{

    public void run(){
        System.out.println("Thread!!!");
    }


    public static void main(String[] args) {
        SampleThread t = new SampleThread();
        t.start();
    }
}
