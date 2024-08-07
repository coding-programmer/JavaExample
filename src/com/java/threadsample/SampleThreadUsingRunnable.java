package com.java.threadsample;

public class SampleThreadUsingRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread running using Runnable Interface");
    }

    public static void main(String[] args) {
        SampleThreadUsingRunnable str =  new SampleThreadUsingRunnable();
        Thread t =  new Thread(str,"Sample Thread");
        System.out.println(t.getName());
        t.start();
    }
}
