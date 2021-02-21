package com.fnkaya.algorithms;

import java.util.Arrays;

public class ArrayRotateLeft {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int s = 4;

        int[] rotatedArr = rotateLeft(arr, 4);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] rotateLeft(int[] arr, int s) {
        int arrSize = arr.length;

        for (int i = 0; i < s; i++) {
            int temp = arr[0];
            for (int j = 0; j < arrSize - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arrSize - 1] = temp;
        }

        return arr;
    }
}
