package com.fnkaya.algorithms;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10, 11};

        int result = arrSum(arr);

        System.out.println(result);
    }

    private static int arrSum(int[] arr) {
        return Arrays.stream(arr).reduce(0, Integer::sum);
    }
}
