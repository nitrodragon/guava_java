package com.nitrodragon.mathandsuch;

import com.google.common.math.BigIntegerMath;
import java.math.BigInteger;

public class Binomial {

    public Binomial(int x, int y) {
        BigInteger result = BigIntegerMath.binomial(x, y);
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Binomial(4, 2);
    }

}
