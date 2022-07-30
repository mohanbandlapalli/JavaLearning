package learn.collections;

public class Employee implements Comparable<Employee>{
        //implements Comparable<Employee>
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return (this.name.compareTo(o.name));
    }





}
