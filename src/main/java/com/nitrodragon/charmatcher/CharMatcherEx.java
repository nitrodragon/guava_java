package com.nitrodragon.charmatcher;

import com.google.common.base.CharMatcher;

public class CharMatcherEx {

    public static void main(String[] args) {

        String input = "NitroDragon147";

        // noinspection deprecation
        CharMatcher matcher = CharMatcher.JAVA_LETTER;
        String result = matcher.retainFrom(input);

        System.out.println(result);
    }
}
