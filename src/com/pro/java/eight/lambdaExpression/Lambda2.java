package com.pro.java.eight.lambdaExpression;


interface  inter2{
    public int sum(int q , int r);
}
public class Lambda2 {

    public static void main(String[] args){
        inter2 i = (q,r)-> (q +r);
        i.sum(10,21);
    }
}
