package com.fnkaya.algorithms;

public class NegativePositiveRatio {

    public static void main(String[] args) {
        int[] arr = {-4, 3, -9, 0, 4, 1};

        plusMinus(arr);
    }

    private static void plusMinus(int[] arr) {
        float pos = 0, neg = 0, zero = 0;
        float total = arr.length;

        for (int j : arr) {
            if (j < 0)
                neg++;
            else if (j > 0)
                pos++;
            else
                zero++;
        }

        System.out.println(pos / total);
        System.out.println(neg / total);
        System.out.println(zero / total);
    }
}
