package com.pro.java.eight.function;


import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    int marks;
    String name;
    Student(int marks, String name){
        this.marks= marks;
        this.name= name;
    }
}


public class FunctionDemo1 {
    public static void populate(ArrayList<Student> listOfStudent) {
        listOfStudent.add(new Student(80, "Rohan"));
        listOfStudent.add(new Student(65, "Mohan"));
        listOfStudent.add(new Student(90, "Dileep"));
        listOfStudent.add(new Student(30, "Raghu"));
        listOfStudent.add(new Student(40, "Jon"));
        listOfStudent.add(new Student(70, "Hari"));
    }

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        populate(studentList);
        Function<Student, String> function = student -> {
            int marksOfStudents = student.marks;
            if (marksOfStudents >= 90) {
                return "Excellent";
            } else if (marksOfStudents < 80 || marksOfStudents > 70) {
                return "Good";
            } else if (marksOfStudents >= 40 || marksOfStudents < 60) {
                return "Average";
            }
            else
                return "Jumbo";
        };
        Predicate<Student> p = s->s.marks>=60;
        for (Student s1 : studentList) {
            if (p.test(s1)) {
                System.out.println("Student Name : " + s1.name);
                System.out.println("Student Marks : " + s1.marks);
                System.out.println("Student Grades :" + function.apply(s1));
            }
        }
    }
}