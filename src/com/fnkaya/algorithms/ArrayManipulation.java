package com.fnkaya.algorithms;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};

        long result = arrayManipulation(10, arr);

        System.out.println(result);
    }

    private static long arrayManipulation(int n, int[][] queries) {
        long[] mArr = new long[n+1];

        for (int[] query : queries) {
            int a = query[0]; //1 - 4 - 6
            int b = query[1]; //5 - 8 - 9
            int k = query[2]; //3 - 7 - 1

            mArr[a-1] += k;
            mArr[b] -= k;

            System.out.println(Arrays.toString(mArr));
        }

        long sum = 0;
        long max = 0;
        for (int i = 0; i < queries.length; i++) {
            sum += mArr[i];
            max = Math.max(max, sum);
        }

        return max;
    }
}
