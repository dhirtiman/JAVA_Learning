package com.Ljava;

public class q9_Method {

    static int add(int a , int b)
    {
        return a+b;
    }
    static int add(int a , int b,int c)
    {
        return a+b+c;
    }

    public static void main(String args[])
    {
        System.out.println(q9_Method.add(2, 3));
        System.out.println(q9_Method.add(2, 3, 5));
    }
    
}
