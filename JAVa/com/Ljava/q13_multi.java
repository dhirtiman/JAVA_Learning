package com.Ljava;

class Person
{
    public void show()
    {
        System.out.println("\nStudent inheriting properties from person\n");
    }
}
class Student extends Person
{
    public void show1()
    {
        System.out.println("I am a student who belongs to the Person class\n");
    }
}

class EngineeringStudent extends Student
{
    public void show2()
    {
        System.out.println("Engineering Student inheriting properties from Student\n");
    }
}

public class q13_multi {
    public static void main(String args[])
    {
        EngineeringStudent obj = new EngineeringStudent();
        obj.show();
        obj.show1();
        obj.show2();
    }
    
}
