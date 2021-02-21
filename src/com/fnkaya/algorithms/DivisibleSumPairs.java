package com.fnkaya.algorithms;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        int result = divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2});
        System.out.println(result);
    }

    public static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0)
                    count++;
            }
        }

        return count;
    }
}
