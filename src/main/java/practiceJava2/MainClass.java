package practiceJava2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class MainClass {
    public static void main(String[] args) {
        Employee e0 = new Employee(1, "Ritik Gupta", "Mechanic", 10000);
        Employee e1 = new Employee(4, "Abishekh Sinha", "CSE", 50000);
        Employee e5 = new Employee(7, "Abishekh1 Sinha", "CSE", 50000);

        Employee e2 = new Employee(2, "Alpha Pandey", "Electric", 150000);
        Employee e3 = new Employee(3, "Sourav Singbonga", "Electronics", 25000);

        List<Employee> employeeList = Arrays.asList(e0, e1, e2, e3, e5);

        employeeList.stream().filter(em->em.getId()==1).findFirst();

        System.out.println(employeeList);
        System.out.println(employeeList.parallelStream().sorted(
                new Comparator<Employee>() {

                    @Override
                    public int compare(Employee o1, Employee o2) {
                        if (o1.getSalary() == o2.getSalary())
                            return o1.getId() - o2.getId();
                        return o1.getSalary() - o2.getSalary();
                    }
                }  .reversed()
        ).collect(Collectors.toList()));

        Arrays.stream(e1.getEmployeeName().split("")).collect(
                groupingBy(Function.identity(), counting())
        );
        Map<String, List<Employee>> employeeMap = employeeList.stream().collect(
                groupingBy(Employee::getEmployeeDepartment)
        );
        System.out.println(employeeMap);
        Function function = (t) -> t;
        System.out.println(function.apply("t"));


        System.out.println(employeeList.stream().collect(
                groupingBy(Employee::getEmployeeDepartment)
                //minBy(practice1.Employee::getSalary)
        ));

       List<Integer> arr = Arrays.asList(4,5,1,6,2,4,8);
        Map<Integer,Integer> map = arr.stream().distinct().collect(Collectors.toMap(
                Integer::intValue, Integer::intValue
        ));
        System.out.println(map);

        map.forEach((key,value) -> {
            System.out.println(key);
        });
        System.out.println(arr.stream().distinct().collect(Collectors.toList()));
    }

    Comparator comparator = new Comparator<Employee>(){
        @Override
        public int compare(Employee e1, Employee e2){
           return e1.getEmployeeDepartment().compareTo(e2.getEmployeeDepartment());
        }
    };


}
