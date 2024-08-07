package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamCountSample {

    public static void main(String[] args) {
        List<String> sampleList = List.of("Test1","Test2","Test3","Test4Data","Test5DataInList","Test5"); //Sample List
        List<Integer> sampleIntList = Arrays.asList(1,2,3,4,5,6,7,8,9,10); //Sample Integer List

        long countValue = printListCount(sampleList);
        System.out.println("Count Value "+countValue);

        long evenCountValue= printEvenNumberCountValue(sampleIntList);
        System.out.println("Even Numbers count Value "+evenCountValue);

        long CountValueBylength =  printCountValuebyLength(sampleList);
        System.out.println("count Value by String Length "+CountValueBylength);
    }

    /**
     * Print Count value by String length greater than 5 in the List
     * @param sampleList
     * @return
     */
    private static long printCountValuebyLength(List<String> sampleList) {
        return sampleList.stream().filter(value -> value.length() > 5).count();
    }

    /**
     * print event Number Count value using Filter operation
     * @param sampleIntList
     * @return
     */
    private static long printEvenNumberCountValue(List<Integer> sampleIntList) {
        return sampleIntList.stream().filter(n->n%2==0).count();
    }

    /**
     * Print Total count of the List
     * @param sampleList
     * @return
     */
    private static long printListCount(List<String> sampleList) {
            return sampleList.stream().count();
    }
}
