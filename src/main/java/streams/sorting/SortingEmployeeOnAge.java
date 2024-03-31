package streams.sorting;

import streams.groupby.Employee;
import streams.groupby.EmployeeListDB;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingEmployeeOnAge {
    private static List<Employee>  empList;
    public static void main(String[] args) {
        empList= EmployeeListDB.getAllEmployeeList();

        /*

1.Write a program to print employee details working in each department

2.Write a program to print employees count working in each department

3.Write a program to print active and inactive employees in the given collection

4.Write a program to print Max/Min employee salary from the given collection

5.Write a program to print the max salary of an employee from each department
         */

        //sort by age
        Stream<Employee> sorted = empList.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Comparator.comparing(Employee::getName)).reversed());
        sorted.forEach(emp-> System.out.println(emp.toString()));

        //1.Write a program to print employee details working in each department
        empList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
        .forEach((dept,emp)-> {
            System.out.println("Dept:" + dept );
            emp.forEach(System.out::println);

        });
        //2.Write a program to print employees count working in each department
        empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                .forEach((k,v)->System.out.println("dept:  "+k+" :count: "+v));

        //4.Write a program to print Max/Min employee salary from the given collection
        Employee min = empList.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("min salary:"+min);
        Employee max = empList.stream().min(Comparator.comparing(Employee::getSalary).reversed()).get();
        System.out.println("max sal"+max);
        //5.Write a program to print the max salary of an employee from each department
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        empList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach(
                (dept,emp)->{
                    System.out.println("Dept:"+dept);
                   double d=emp.stream().mapToDouble(e->e.getSalary()).sorted().findFirst().orElse(0.0);
                    Stream<Employee> limit = emp.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(1);
                    System.out.println("emp:"+ d);
                }


        );

    }


}
