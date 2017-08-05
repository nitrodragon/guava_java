package com.nitrodragon.mathandsuch;

import com.google.common.math.BigIntegerMath;

public class Factorial {

    public Factorial(int num) {
        System.out.println(BigIntegerMath.factorial(num));
    }

    public static void main(String[] args) {
        new Factorial(10);
    }
}
