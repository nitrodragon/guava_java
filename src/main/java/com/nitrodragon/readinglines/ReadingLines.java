package com.nitrodragon.readinglines;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadingLines {

    public static void main(String[] args) throws IOException {

        String filename = "res/mcknight.txt";

        List<String> lines = Files.readLines(new File(filename),
                Charsets.UTF_8);

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
