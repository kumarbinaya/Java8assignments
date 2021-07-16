package com.java8.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDetailAnalysis {
       List<Employee> employeeList = EmployeeRepo.getListofEmployees();
       // Assignment 1
        public  List<Employee> getDepartmentEmployeeList(String dept){
            employeeList.stream().filter(emp -> processEmployee(emp , dept)).collect(Collectors.toList());
            return employeeList;
        }
        public double getTotalEmployeeSalaries() {
            return  employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();

        }
        public Optional<Employee> getEmployeeWithHighestSalary() {
            return (Optional<Employee>) employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        }

        public  List<Employee> getSortedEmployeesBasedOnDepartmentAndSalary() {
            return employeeList.stream()
                    .sorted(processEmployeesBasedOnDepartmentAndSalary())
                    .collect(Collectors.toList());

        }
    // Assignment 2
        public Map<String, List<Employee>> getListOfEmployeePerDepartments() {
            return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        }

        public  Map<String, Long> getTotalEmployeesCountPerDepartment() {
            return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        }
        private static Boolean processEmployee(Employee emp, String dept) {
          return emp.getDepartment().contains(dept);
        }

        private Comparator<? super Employee> processEmployeesBasedOnDepartmentAndSalary() {
           return Comparator.comparing(Employee::getDepartment)
                    .thenComparing(Comparator.comparing(Employee::getSalary).reversed());
        }


}
