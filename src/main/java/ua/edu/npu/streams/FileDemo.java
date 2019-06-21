package ua.edu.npu.streams;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String file = "src/main/resources/files/fileToWrite.txt";
        File path = new File(file);
        System.out.println("Path is: " + path);
        System.out.println("Exist? -> " + path.exists());
        System.out.println("Directory? -> " + path.isDirectory());

        OutputStream outputStream = new FileOutputStream(path);
        outputStream.write("Hello".getBytes());

    }
}
