package com.fnkaya.algorithms;

public class MinimumSwapForSorting {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5};

        int result = minimumSwaps(arr);

        System.out.println(result);
    }

    private static int minimumSwaps(int[] arr) {
        int swapCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                int j = i;

                while (arr[j] != i + 1) {
                    j++;
                }

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                swapCount++;
            }
        }

        return swapCount;
    }
}
