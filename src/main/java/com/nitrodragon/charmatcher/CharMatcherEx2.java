package com.nitrodragon.charmatcher;

import com.google.common.base.CharMatcher;

public class CharMatcherEx2 {

    public static void main(String[] args) {

        String str = "Perfectly penniless in a newly nihilistic nation.";

        int n1 = CharMatcher.is('n').countIn(str);
        System.out.format("Number of n characters: %d%n", n1);

        int n2 = CharMatcher.is('i').countIn(str);
        System.out.format("Number of i characters: %d", n2);
    }
}
