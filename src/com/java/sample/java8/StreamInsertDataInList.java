package com.java.sample.java8;

import com.java.model.Employee;
import com.java.model.EmployeeUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamInsertDataInList {

    public static void main(String[] args) {
        List<Employee> empList = EmployeeUtil.getEmployeeList();

        Employee empNew = new Employee(6, "Hello User");

        int startIndex = 2;
        int endIndex = 3;
        List<Employee> updatedList = IntStream.range(0, empList.size() + 1).mapToObj(index -> {
            if (index < startIndex) {
                return empList.get(index);
            } else if (index == startIndex) {
                return empNew;
            } else {
                return empList.get(index - 1);
            }
        }).collect(Collectors.toList());

        updatedList.stream().map(x -> x.getName()).forEach(System.out::println);

        //output
        /*
        John
        Tom
        Hello User
        Jerry
        Vin
        Rock*/

    }
}
