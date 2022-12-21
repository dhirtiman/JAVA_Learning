package com.Ljava;

import java.util.Scanner;

public class q6 {

    public static void main(String args[]) {

        int sum = 0;
        int number;
        number = Integer.parseInt(args[0]);
        System.out.println("Enter " + number + " Integers");
        Scanner s = new Scanner(System.in);

        
        for (int i = 0; i < number; i++) {
            sum = s.nextInt() + sum;
        }

        System.out.println("The sum is "+sum);
        s.close();

    }

}
