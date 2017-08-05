package com.nitrodragon.preconditions;

import static com.google.common.base.Preconditions.checkArgument;

import com.google.common.base.Splitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Preconditions {

    private Preconditions() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter items: ");
        String input = br.readLine();

        List<String> items = Splitter.on(" ").splitToList(input);
        OutputItems(items);
    }

    private static void OutputItems(List<String> items) {
        checkArgument(items != null, "The list must not be null");
        checkArgument(!items.isEmpty(), "The list must not be empty.");

        for (String item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) throws IOException {
        new Preconditions();
    }
}
