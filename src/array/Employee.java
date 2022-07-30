package array;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    String name;
    int age;
    String country;

    static int id;

    public Employee(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(country, employee.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, country);
    }

    @Override
    public int compareTo(Employee o) {
        return (this.country.compareTo(o.country));
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", age=" + age + ", country='" + country +";";
    }
}
