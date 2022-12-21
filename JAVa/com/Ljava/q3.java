package com.Ljava;

public class q3 {

    public static void main(String args[]) {

        int array[];

        array = new int[6];

        array[0] = 12;
        array[1] = 15;
        array[2] = 32;
        array[3] = 62;
        array[4] = 72;
        array[5] = 76;
        
        System.out.print("Elements of Array are: ");

        for(int i = 0; i < array.length;i++)
        {System.out.print(array[i] + " ");}
    }
}
