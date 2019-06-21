package ua.edu.npu.streams;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ReadUseLines {
    public static void main(String[] args) {
        String filename = "src/main/resources/files/file.txt";
        File file = new File(filename);

        try (Stream<String> linesStream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
/*
            linesStream.forEach(line -> {
                System.out.println(line);
            });
//*/
//*
            linesStream.forEach(System.out::println);
//*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
