package com.java8.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRepo {
    public static List<Employee> getListofEmployees(){

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("binaya", " kumar", 32000,  "Study"));
        employeeList.add(new Employee("rajeev", " biswal", 25000, "Site"));
        employeeList.add(new Employee("Rahul", "roy", 29000,  "countryMangnt"));
        employeeList.add(new Employee("parveen", "Gowda", 28000,  "HR"));
        employeeList.add(new Employee("Rubi", " Roy", 27000,  "Study"));
        employeeList.add(new Employee("Sham", "kumar", 43000,  "Site"));

        return employeeList;
    }


}
