package com.java.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamCountByWordSample {

    public static void main(String[] args) {
        List<String> sampleList = List.of("Test1","Test2","Test3","Test4Data","Test5DataInList","Test5"); //Sample List


        sampleList.stream().collect(Collectors.toMap(x->x.toString(), x->x.length())).forEach((k,v)-> {
            System.out.println(k+" "+v);
        });;

    }


}
