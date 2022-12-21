package com.Ljava;

import java.util.Scanner;

public class q2 {

    static int factorial(int n) {

        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the number: ");
            n = in.nextInt();
            System.out.println("Factorial of " + n + " is " + factorial(n));
        } finally {
            in.close();
        }
    }
}
