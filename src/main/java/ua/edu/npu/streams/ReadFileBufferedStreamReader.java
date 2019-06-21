package ua.edu.npu.streams;

import java.io.*;

public class ReadFileBufferedStreamReader {
    public static void main(String[] args) {
        try {
            launch();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void launch() throws IOException {
        String path = "src/main/resources/files/file.txt";
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
