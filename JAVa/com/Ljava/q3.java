package com.Ljava;

import java.util.Scanner;

public class q3 {

    public static void main(String args[]) {

        int num;
        int array[];

        array = new int[6];

        array[0] = 12;
        array[1] = 15;
        array[2] = 32;
        array[3] = 62;
        array[4] = 72;
        array[5] = 76;

        System.out.print("Elements of Array are: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("\nEnter the number to search in the array:  ");
            num = sc.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (num == array[i]) {
                    System.out.println(num + " found at position: " + (i + 1));
                    return;
                }
            }
            System.out.println(num + " not found in this Array!");
        } finally {
            sc.close();
        }
    }

}
