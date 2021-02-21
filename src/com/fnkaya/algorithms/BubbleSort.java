package com.fnkaya.algorithms;

public class BubbleSort {

    public static void main(String[] args) {
        countSwaps(new int[]{3, 2, 1});
    }

    public static void countSwaps(int[] a) {
        int arraySize = a.length;
        int swapCount = 0;

        for (int i = 0; i < arraySize; i++) {
            for (int index = 0; index < arraySize - 1; index++) {
                if (a[index] > a[index + 1]) {
                    swap(a, index, index + 1);
                    swapCount++;
                }
            }
        }

        System.out.printf("Array is sorted in %s swaps.\n", swapCount);
        System.out.printf("First element: %s\n", a[0]);
        System.out.printf("Last element: %s\n", a[arraySize - 1]);
    }

    private static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
