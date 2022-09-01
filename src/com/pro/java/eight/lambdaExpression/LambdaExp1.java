package com.pro.java.eight.lambdaExpression;

interface inter{
    public String m1(String s1 , String s2);
}

public class LambdaExp1 {

    public static void main(String[] args) {

        inter i = (firstName, lastName)->
                firstName + lastName;
       System.out.println( i.m1("Ram " , "Sita"));

    }
}