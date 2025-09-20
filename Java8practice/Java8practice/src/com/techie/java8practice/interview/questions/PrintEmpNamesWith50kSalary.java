package com.techie.java8practice.interview.questions;

import com.techie.java8practice.entities.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintEmpNamesWith50kSalary {
    public static void main(String[] args) {
        List<Employee> employeeList =
                Arrays.asList(
                        new Employee(50001,"hari"),
                        new Employee(50001,"hari"),
                        new Employee(50001,"hari"),
                        new Employee(50001,"hari"),
                        new Employee(40000,"krishna"),
                        new Employee(15000,"gowri"),
                        new Employee(60000,"krishna"),
                        new Employee(85000,"gunvitha"),
                        new Employee(40000,"narayan"),
                        new Employee(30000,"kishore"),
                        new Employee(24000,"akhila"));

        Set<String> empList = employeeList.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .distinct()
                .map(Employee::getName)
                .collect(Collectors.toSet());

        System.out.println("Printing employee names where salary more than 50000");
        System.out.println(empList);
    }
}
