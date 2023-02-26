package com.Ljava;

import java.io.*;

public class q20_ReadWrite {
    public static void main(String[] args) {
        String sourceFile = "com/Ljava/file.txt";
        String destinationFile = "com/Ljava/file2.txt";

        try {
            FileReader fileReader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(destinationFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}

