package streams.groupby;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByExample {
    private static List<Employee> employeeList;

    public static void main(String[] args){
        employeeList= EmployeeListDB.getAllEmployeeList();

        System.out.println(employeeList);
        //employeeList.stream().forEach(System.out::println);
        // Query 1 : How many male and female employees are there in the organization?
        method1();
        // Query 2 : Print the name of all departments in the organization?

        // method2();
        System.out.println("\n");
        // Query 3 : What is the average age of male and female employees?

        //method3();
        System.out.println("\n");
        // Query 4 : Get the details of highest paid employee in the organization?

        //method4();
        System.out.println("\n");
        // Query 5 : Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(emp->emp.getYearOfJoining()>=2015).map(emp->emp.getName());
        // method5();
        System.out.println("\n");
        // Query 6 : Count the number of employees in each department?
        // method6();
        System.out.println("\n");
        // Query 7 : What is the average salary of each department?
        // method7();
        System.out.println("\n");
        // Query 8 : Get the details of youngest male employee in the product
        // // development department?
        // method8();
        System.out.println("\n");
        // Query 9 : Who has the most working experience in the organization?
        // method9();
        System.out.println("\n");
        // Query 10 : How many male and female employees are there in the sales and
        // marketing team?
        //method10();
        System.out.println("\n");
        // Query 11 : What is the average salary of male and female employees?
        // method11();
        System.out.println("\n");
        // Query 12 : List down the names of all employees in each department?
        // method12();
        System.out.println("\n");
        // Query 13 : What is the average salary and total salary of the whole
        // organization?
        // method13();
        System.out.println("\n");
        // Query 14 : Separate the employees who are younger or equal to 25 years from
        // those employees who are older than 25 years.
        // method14();
        System.out.println("\n");
        // Query 15 : Who is the oldest employee in the organization? What is his age
        // and which department he belongs to?
        // method15();

    }

    private static void method1() {
        System.out.println("Query 1 : max salary ");
        Employee employee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
        System.out.println(employee.getSalary());
        System.out.println("Query 1 : min salary ");
        Employee employee1 = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).get();
        System.out.println(employee1.getSalary());
        System.out.println("highest salary from each dept");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((k,v)-> System.out.println("dept:"+k+":high sal:"+v.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get().getSalary()));
        System.out.println("Employee working in each Dept");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach(
                (k,v)-> {
                    System.out.println("Dept:"+k);
                    System.out.println("Employee Detail:");
                    v.stream().forEach(System.out::println);
                }


        );

    }
}
