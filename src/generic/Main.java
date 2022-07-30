package generic;

import learn.collections.AgeComparator;
import learn.collections.Employee;
import learn.collections.NameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee mohan = new Employee("mohan", 30);
        Employee naveen = new Employee("naveen", 16);
        Employee gotham = new Employee("gotham", 26);

        List<Employee> employeesList = new ArrayList<>();

        employeesList.add(mohan);
        employeesList.add(naveen);
        employeesList.add(gotham);

   //     Collections.sort(employeesList);

  //      System.out.println(employeesList);

        Collections.sort(employeesList, new NameComparator());
        System.out.println("Name" + employeesList);
        Collections.sort(employeesList, new AgeComparator());
        System.out.println("Age" +employeesList);

    }
}

