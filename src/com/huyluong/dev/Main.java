package com.huyluong.dev;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            FileWriter myWriter = new FileWriter("filename.txt", true);
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
