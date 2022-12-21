package com.Ljava;

public class q4 {

    public static void toBinary(int decimal) {
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {

            binary[index++] = decimal % 2;
            decimal = decimal / 2;

        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {

        System.out.println("Binary of 10 is: ");
        toBinary(10);
        System.out.println("Binary of 21 is: ");
        toBinary(21);
        System.out.println("Binary of 69 is: ");
        toBinary(69);
        System.out.println("Binary of 5 is: ");
        toBinary(5);

    }

}
