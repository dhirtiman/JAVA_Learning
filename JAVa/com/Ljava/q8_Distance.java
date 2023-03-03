package com.Ljava;

import java.lang.Math;
import java.util.Scanner;

public class q8_Distance {

    int x1, y1, x2, y2;

    q8_Distance(int a, int b, int c, int d) {
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
    }

    float distance() {
        float dis = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dis;

    }

    public static void main(String args[]) {

        int a, b, c, d;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the coordinates for the first point: ");
            System.out.println("x1=");
            a = s.nextInt();
            System.out.println("y1=");
            b = s.nextInt();
            System.out.println("Enter the coordinates of the second point: ");
            System.out.println("x2=");
            c = s.nextInt();
            System.out.println("y2=");
            d = s.nextInt();

            q8_Distance di = new q8_Distance(a, b, c, d);
            System.out.println("The distance between the two points is "+di.distance());
        } finally {
            s.close();
        }

    }

}
