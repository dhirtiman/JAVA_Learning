package com.Ljava;


 class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class q17_OwnExcep {
    public static void main(String[] args) {
        int num = -1;
        try {
            if (num < 0) {
                throw new CustomException("Number cannot be negative.");
            }
            System.out.println("Number is: " + num);
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}
