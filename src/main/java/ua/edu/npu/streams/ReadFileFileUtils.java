package ua.edu.npu.streams;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadFileFileUtils {
    public static void main(String[] args) throws IOException {
        String filename = "src/main/resources/files/file.txt";
        File file = new File(filename);
        List<String> fileListStrings = FileUtils.readLines(file, "UTF-8");
        for (String s: fileListStrings) {
            System.out.println(s);
        }
    }
}
