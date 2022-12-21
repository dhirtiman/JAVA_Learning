package com.Ljava;
import java.util.Scanner;

public class StarProgram {

    public static void main(String args[]) {
        int i, j, n;

        System.out.println("Enter number of lines ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();


        int k = n;
        for (i = 0; i <= n; i++) {
            System.out.println("");
            for (j = k; j >= 0; j--) {
                System.out.print(" ");

            }
            k--;
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
        }
    }

}
