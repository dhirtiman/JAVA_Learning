package com.Ljava;

import java.util.Scanner;

public class q16_excepH {

    static int divide(int x, int y) throws ArithmeticException {

        if (y == 0) {
            throw new ArithmeticException();
        } else {
            return x / y;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of x: ");
            int x = sc.nextInt();
            System.out.println("Enter the value of y: ");
            int y = sc.nextInt();

            int res = divide(x, y);
            System.out.println(x + "/" + y + "=" + res);
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception: Cannot divide an integer by Zero!");
        } finally {
            sc.close();
            System.out.println("\nRemaining Code Execution...");
        }
    }
}
