package com.java.sample.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamConsumerExample {
    /**
     * Created a static consumer to print custom logic
     */
    static Consumer<String> printConsumer = ((value)->{
            System.out.println("Output String :"+value);
    });

    /**
     * Created a static consumer to print custom logic if String length greater than 5
     */
    static Consumer<String> printConsumerGreaterThan5 = ((value)->{
        if(value.length()>5)
            System.out.println("Output String length greater than 5 :"+value);
    });

    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {
        List<String> sampleList = List.of("Test1","Test2","Test3","Test4Data","Test5DataInList","Test5"); //Sample List
        List<Integer> sampleIntList = Arrays.asList(1,2,3,4,5,6,7,8,9,10); //Sample Integer List

        printListValuesUsingConsumer(sampleList);

        System.out.println("***************************");
        printListValuesUsingCombineConsumer(sampleList);
    }

    /**
     * Print the List Values using Consumer
     * @param sampleList
     */
    private static void printListValuesUsingConsumer(List<String> sampleList) {
        sampleList.stream().forEach(printConsumer);
    }

    /**
     * Print the List Values by combining Consumer's
     * @param sampleList
     */
    private static void printListValuesUsingCombineConsumer(List<String> sampleList) {
        sampleList.stream().forEach(printConsumer.andThen(printConsumerGreaterThan5));
    }
}
