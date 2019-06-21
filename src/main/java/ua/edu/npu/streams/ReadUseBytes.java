package ua.edu.npu.streams;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ReadUseBytes {
    public static void main(String[] args) throws IOException {
        String filename = "src/main/resources/files/file.txt";
        File file = new File(filename);
        byte [] fileBytes = Files.readAllBytes(file.toPath());
        char singleChar;
        for (byte b: fileBytes) {
            System.out.print((char)b);
        }
    }
}
