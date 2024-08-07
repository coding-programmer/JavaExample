package com.java.threadsample.Future;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestClassWithDelay {

    public String getValuesWithDelay(){
        delayBySec();
        return IntStream.range(0,10).boxed().map(Object::toString).collect(Collectors.joining(","));
    }

    public String DelayMethod2(){
        delayBySec();
        return "welcome";
    }

    public void delayBySec(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
