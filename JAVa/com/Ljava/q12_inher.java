package com.Ljava;

// Program to Implement Single-Level Inheritance

class Sum {
    int x, y;

    Sum(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);

    }
}

class Dervd extends Sum {
    Dervd(int x, int y) {

        super(x, y);
    }
    void sumOfXY(){
        int sum = x+y;
        System.out.println("The sum of "+x+" and "+y+" is: "+sum);
    }
}

public class q12_inher {

    public static void main(String args[]) {

        Dervd d = new Dervd(6, 7);
        d.display();
        d.sumOfXY();

    }

}
