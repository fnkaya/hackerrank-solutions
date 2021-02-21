package com.fnkaya.algorithms;

import java.util.Arrays;

public class LongSum {

    public static void main(String[] args) {
        long[] longArr = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};

        long result = sumLong(longArr);

        System.out.println(result);
    }

    private static long sumLong(long[] ar) {
        return Arrays.stream(ar).reduce(0, Long::sum);
    }
}
