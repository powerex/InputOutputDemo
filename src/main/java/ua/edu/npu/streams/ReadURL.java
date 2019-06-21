package ua.edu.npu.streams;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadURL {
    public static void main(String[] args) throws IOException {
//        URL url = new URL("http://google.com");
        URL url = new URL("http://mirrors.xmission.com/gutenberg/etext98/allyr10.txt");
//        URL url = new URL("http://tolstoy.ru/upload/iblock/dac/voina-i-mir.epub");
        InputStream inputStream = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
