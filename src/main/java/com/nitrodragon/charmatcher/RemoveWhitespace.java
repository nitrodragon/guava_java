package com.nitrodragon.charmatcher;

import com.google.common.base.CharMatcher;

public class RemoveWhitespace {

    public static void main(String[] args) {
        String input = "\tShrek\t";

        String result = CharMatcher.whitespace().trimFrom(input);

        System.out.println(input + " and memes");
        System.out.println(result + " and memes");
    }
}
