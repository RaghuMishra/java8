package com.pro.java.eight.function;


import java.util.ArrayList;
import java.util.function.Function;

class Employee{
    String name;
    double salary;
    Employee(String name, double salary){
        this.name= name;
        this.salary= salary;
    }

    public String toString(){
        return name+ "" + salary;
    }
}
public class TestEmployee {
    public static void main(String[] args) {

        ArrayList<Employee> arrayListOfEmployee = new ArrayList<>();
        populate(arrayListOfEmployee);
        Function<ArrayList<Employee>,Double> function= emp-> {

            double empSalarty =0;
            for (Employee emp1 : emp){
                empSalarty= empSalarty+emp1.salary;
            }
            return empSalarty;

        };
        System.out.println(function.apply(arrayListOfEmployee));
    }

    public static void populate(ArrayList<Employee> arrayListOfEmployee) {
        arrayListOfEmployee.add(new Employee("Ram", 199000));
        arrayListOfEmployee.add(new Employee("Dileep", 299099));
        arrayListOfEmployee.add(new Employee("Vikas", 1020020));
        arrayListOfEmployee.add(new Employee("Sandeep", 555443));

    }
}
