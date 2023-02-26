package com.Ljava;

import java.util.Scanner;

class DemoStatic {

    static final float pi = 3.14f; // static data member

    static String ReverseString(String str) {
        char ch = ' ';
        String strev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            strev += ch;

        }
        return strev;

    }

}

public class q10_StaticMnM {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nThe value of PI is " + DemoStatic.pi);
        System.out.println("Enter a String: ");
        String str = input.nextLine();
        input.close();
        System.out.println("\nGiven String is: " + str);

        String revString = DemoStatic.ReverseString(str);
        System.out.println("Reversed String is: " + revString);
    }
}
