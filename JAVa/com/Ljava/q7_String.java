package com.Ljava;
import java.lang.String;

public class q7_String {

    public static void main(String args[]) {

        StringBuffer s = new StringBuffer("books");
        System.out.println("The String: "+s);

        System.out.println("");

        s.setCharAt(0,'h');
        System.out.println("setting 'h' at index 0");
        System.out.println("The String: "+s);

        System.out.println("");

        s.setLength(4);
        System.out.println("Setting string length to 4");
        System.out.println("The String: "+s);

        System.out.println("");

        s.append('s');
        System.out.println("Appending 's' in the string");
        System.out.println("The String: "+s);

        System.out.println("");

        s.insert(4,'e');
        System.out.println("adding 'e' at the offset of index 4");
        System.out.println("The String: "+s);

        System.out.println("");
        

        String s1 = new String("Pointy ");
        System.out.println("String 1: "+s1);
        String s2 = new String("Swords ");
        System.out.println("String 2: "+s2);

        System.out.println("");

        System.out.println("Concatinating "+s1+" and "+s2);
        System.out.println(s1.concat(s2));

        System.out.println("");

        System.out.println("Comparing String 1 and String 2");
        if(s1.equals(s2))
        {
            System.out.println(s1+" and "+s2+"are equal");

        }
        else
        {
            System.out.println(s1+"and "+s2+"are not equal");
        }




        






    }

}
