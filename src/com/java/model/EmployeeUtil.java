package com.java.model;

import java.util.Arrays;
import java.util.List;

/**
 * Util Class
 */
public class EmployeeUtil {

    public static List<Employee> getEmployeeList(){

        Employee emp1 = new Employee(1,"John");
        Employee emp2 = new Employee(2,"Tom");
        Employee emp3 = new Employee(3,"Jerry");
        Employee emp4 = new Employee(4,"Vin");
        Employee emp5 = new Employee(5,"Rock");

        return Arrays.asList(emp1,emp2,emp3,emp4,emp5);

    }

}
