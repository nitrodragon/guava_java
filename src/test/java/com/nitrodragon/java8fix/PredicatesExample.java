package com.nitrodragon.java8fix;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Objects;

public class PredicatesExample {

    public static void main(String[] args) {

        List<Integer> values = Lists.newArrayList(3, null, 4, 7, 8, null, 7);

        Iterable<Integer> filtered = Iterables.filter(values, Objects::nonNull);

        for (Integer i: filtered) {
            System.out.println(i);
        }
    }
}