package ua.edu.npu.streams;

import java.io.*;

public class ReadFileBufferedStreamReaderEncoding {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/files/file.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
