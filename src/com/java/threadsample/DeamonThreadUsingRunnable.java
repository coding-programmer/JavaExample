package com.java.threadsample;

public class DeamonThreadUsingRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread running using Runnable Interface");
    }

    public static void main(String[] args) {
        DeamonThreadUsingRunnable str =  new DeamonThreadUsingRunnable();
        Thread t =  new Thread(str,"Deamon Thread");
        t.setDaemon(true);
        System.out.println(t.getName());
        t.start();
    }
}
