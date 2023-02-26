package com.Ljava;

import java.io.*;

public class q19_CountXFile {
    public static void main(String[] args) {
        String filename = "com/Ljava/file.txt";
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;

                // Count characters
                charCount += line.length();

                // Count words
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("File \"" + filename + "\" contains:");
        System.out.println(charCount + " characters");
        System.out.println(wordCount + " words");
        System.out.println(lineCount + " lines");
    }
}
