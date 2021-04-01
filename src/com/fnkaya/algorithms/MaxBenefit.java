package com.fnkaya.algorithms;

import java.util.Arrays;

public class MaxBenefit {

    public static void main(String[] args) {
        System.out.println(maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50));
    }

    public static int maximumToys(int[] prices, int k) {
        int count = 0;
        int total = 0;

        Arrays.sort(prices);

        for (int i = 0; i < prices.length; i++) {
            if (total + prices[i] >= k)
                break;
            total += prices[i];
            count++;
        }

        return count;
    }
}
