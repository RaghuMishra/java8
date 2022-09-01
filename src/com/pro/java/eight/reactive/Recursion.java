package com.pro.java.eight.reactive;

public class Recursion {

    public void recur(int n){
        if(n==0) return;
        recur(n-1); 
        System.out.println(n);
    }
}
