package com.nitrodragon.stringstuff;

import com.google.common.base.Splitter;

import java.util.List;

public class StringSplitter2 {

    private StringSplitter2() {
        String input = "memes, water, air, fire, apples";
        List<String> words = Splitter.on(",").trimResults()
                .limit(3)
                .splitToList(input);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        new StringSplitter2();
    }
}
