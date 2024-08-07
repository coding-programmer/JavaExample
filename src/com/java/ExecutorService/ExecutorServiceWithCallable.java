package com.java.ExecutorService;

import java.util.concurrent.*;

public class ExecutorServiceWithCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(4);
        for(int i=0;i<10;i++) {
            Callable<String> callable = new SampleTaskWithCallable("Thread name ::"+i);
            ;
            Future<String> future = service.submit(callable);
            System.out.println(future.get());
        }
        service.shutdown();;
    }
}
