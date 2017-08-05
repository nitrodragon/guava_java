package com.nitrodragon.stringstuff;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;

public class StringJoiner {

    private StringJoiner() {
        List<String> list = Lists.newArrayList("8", "2", "7", "10");
        String result = Joiner.on(", ").join(list);
        System.out.println(result);
    }

    public static void main(String[] args) {
        new StringJoiner();
    }
}
