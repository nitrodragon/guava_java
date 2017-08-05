package com.nitrodragon.stringstuff;

import com.google.common.base.Splitter;

import java.util.List;

public class StringSplitter {

    private StringSplitter() {

        String input = "There's a dog in the garden.";
        List<String> words = Splitter.on(" ").splitToList(input);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        new StringSplitter();
    }
}
