package com.Ljava;

public class q11_boxun {

    public static void main(String args[]) {


        int b = 2526;
        Integer box = Integer.valueOf(b);   //Boxing
        System.out.println("After boxing: "+box);

        int z = box;
        System.out.println("After unboxing: " + z);

    }

}
