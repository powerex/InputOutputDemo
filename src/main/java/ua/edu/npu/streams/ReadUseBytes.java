package ua.edu.npu.streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadUseBytes {
    public static void main(String[] args) throws IOException {
        String filename = "src/main/resources/files/file.txt";
        File file = new File(filename);
        byte [] fileBytes = Files.readAllBytes(file.toPath());
        for (byte b: fileBytes) {
            System.out.print((char)b);
        }
    }
}
