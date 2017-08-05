package com.nitrodragon.mathandsuch;

import com.google.common.collect.Range;

public class Ranges {

    public static void main(String[] args) {

        Range<Integer> range = Range.closed(3, 8);
        System.out.println(range);

        Range<Integer> range1 = Range.openClosed(3, 8);
        System.out.println(range1);

        Range<Integer> range2 = Range.closedOpen(3, 8);
        System.out.println(range2);
    }
}
