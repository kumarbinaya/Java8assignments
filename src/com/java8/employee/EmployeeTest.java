package com.java8.employee;

public class EmployeeTest {
    public static void main(String[] args){
        EmployeeDetailAnalysis empAnalysis = new EmployeeDetailAnalysis();
        System.out.println("Assignment 1 ");
        System.out.println("List of All Employees based on department"
                + empAnalysis.getDepartmentEmployeeList("STUDY"));
        System.out.println("Total salary of All Employess " + empAnalysis.getTotalEmployeeSalaries());
        System.out.println("Employee with max salary is " + empAnalysis.getEmployeeWithHighestSalary());

        System.out.println("Employees after sorting by department and decreasing order of salary"
                + empAnalysis.getSortedEmployeesBasedOnDepartmentAndSalary());

        System.out.println("Assignment 2");
        System.out.println("List of employees based on department in map structure"
                + empAnalysis.getListOfEmployeePerDepartments());
        System.out.println("Count total employees per department" + empAnalysis.getTotalEmployeesCountPerDepartment());
       }
}
