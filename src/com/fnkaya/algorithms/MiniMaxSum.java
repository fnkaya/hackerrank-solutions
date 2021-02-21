package com.fnkaya.algorithms;

import java.util.Arrays;

public class MiniMaxSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 7, 4, 5};

        miniMaxSum(arr);
    }

    private static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            minSum += arr[i];
            maxSum += arr[arr.length - (i+1)];
        }

        System.out.println(minSum + " " + maxSum);
    }
}
