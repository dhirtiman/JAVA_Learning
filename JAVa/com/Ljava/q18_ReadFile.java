package com.Ljava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class q18_ReadFile {
    public static void main(String[] args) {
        String fileName = "com/Ljava/file.txt";
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
