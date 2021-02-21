package com.fnkaya.algorithms;

import java.util.Arrays;

public class BreakingTheRecords {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1})));
    }

    public static int[] breakingRecords(int[] scores) {
        int min = scores[0],
                max = scores[0];
        int[] result = new int[2];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == scores[i - 1])
                continue;

            if (scores[i] < min) {
                min = scores[i];
                result[1]++;
            }

            if (scores[i] > max) {
                max = scores[i];
                result[0]++;
            }
        }

        return result;
    }
}
