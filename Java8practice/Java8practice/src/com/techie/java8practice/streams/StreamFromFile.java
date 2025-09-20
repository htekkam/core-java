package com.techie.java8practice.streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromFile {
    public static void main(String[] args) {
        long totalUniqueWords = 0;
        try(Stream<String> lines =
                    Files.lines(Paths.get("data.txt"), Charset.defaultCharset())){
            totalUniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();

            System.out.println("Total count of words::"+totalUniqueWords);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
