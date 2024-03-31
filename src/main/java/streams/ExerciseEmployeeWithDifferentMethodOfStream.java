package streams;

import java.util.*;
import java.util.stream.Collectors;

public class ExerciseEmployeeWithDifferentMethodOfStream {
    static List<Employee> employeeList = new ArrayList<Employee>();
    public static void main(String[] args) {
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        // Query 1 : How many male and female employees are there in the organization?
        //method1();
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
                .entrySet().stream().forEach(m->System.out.println(m.getKey()+":"+":"+m.getValue()));
        System.out.println("______________________________How many male and female employees are there in the organization?_____________________________________________________");
        // Query 2 : Print the name of all departments in the organization?



        System.out.println("_________________________________Print the name of all departments in the organization?__________________________________________________");
        // method2();
        employeeList.stream().map(employee -> employee.getDepartment()).distinct().forEach(System.out::println);

        System.out.println("\n");
        // Query 3 : What is the average age of male and female employees?

        System.out.println("_________________________________What is the average age of male and female employees?__________________________________________________");
        //method3();
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge))).entrySet().stream()
                .forEach(m->System.out.println(m.getKey()+":"+m.getValue()));
        System.out.println("\n");
        // Query 4 : Get the details of highest paid employee in the organization?
        System.out.println("_________________________________Get the details of highest paid employee in the organization?__________________________________________________");
        employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        //method4();
     //   System.out.println("\n");
        // Query 5 : Get the names of all employees who have joined after 2015?

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
        System.out.println("_________________________________List down the names of all employees in each department?__________________________________________________");
        // Query 12 : List down the names of all employees in each department?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream()
                .forEach(m-> {
                    System.out.println("Dept:::::::::::::::::::::::::"+m.getKey());
                    m.getValue().stream().map(Employee::getName).forEach(System.out::println);

                });
        // method12();
        System.out.println("\n");
        System.out.println("_________________________________ What is the average salary and total salary of the whole organization?_________________________________________________");

        // Query 13 : What is the average salary and total salary of the whole organization?
        Double avg = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average salary:"+avg);
        Double total = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Total salary:"+total);

        // method13();
        System.out.println("\n");

        System.out.println("_________________________________Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years._________________________________________________");

        // Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25)).entrySet().stream()
        .forEach(e->
        {
            if(e.getKey()){
                System.out.println("Eldern");
                e.getValue().stream().forEach(ee-> System.out.println("Only Name:"+ee.getName()));
            }
            else
            {
                System.out.println("Younger ");
                e.getValue().stream().forEach(ee-> System.out.println("Only Name:"+ee.getName()));
            }
        });


        // method14();
        System.out.println("\n");
        System.out.println("_________________________________Who is the oldest employee in the organization? What is his age and which department he belongs to?_________________________________________________");

        // Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        // method15();
        Employee e=employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();
        System.out.println("age:"+e.getAge()+" : dept:"+e.getDepartment());

    }
}
