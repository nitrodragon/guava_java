package com.nitrodragon.collections;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;

public class InitCollections {

    private InitCollections() {
        Map items = ImmutableMap.of("coin", 3, "glass", 4, "pencil", 1);

        items.entrySet().forEach(System.out::println);

        List<String> fruits = Lists.newArrayList("orange", "banana", "kiwi", "mandarin", "date", "quince");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    public static void main(String[] args) {
        new InitCollections();
    }
}
