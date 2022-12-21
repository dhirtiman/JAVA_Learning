package com.Ljava;

import java.util.Scanner;

public class eyy {
    public static void main(String args[]) {
        int a, b;
        System.out.println("Enter two numbers");
        Scanner s = new Scanner(System.in);
        try{
        a = s.nextInt();
        b = s.nextInt();

        System.out.println("The sum of "+a);
        System.out.print(" and "+b);
        System.out.print(" is " +(a+b));
        }
        finally{
            s.close();
        }

    }
}
