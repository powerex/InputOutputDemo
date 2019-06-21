package ua.edu.npu.streams;

import java.io.*;

public class ReadFileBufferedStreamRead {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/files/file.txt";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int singleCharInt;
        char singleChar;
        while ((singleCharInt = bufferedInputStream.read()) != -1) {
            singleChar = (char) singleCharInt;
            System.out.println(singleChar);
        }
    }
}
