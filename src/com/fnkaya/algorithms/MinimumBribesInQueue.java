package com.fnkaya.algorithms;

public class MinimumBribesInQueue {

    public static void main(String[] args) {
        int[] arr = {2,1,5,3,4};

        minimumBribes(arr);
    }

    private static void minimumBribes(int[] arr) {
        int arrSize = arr.length;

        for (int i = 0; i < arrSize; i++) {
            if (arr[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }

        int totalBribes = 0;

        for (int i = 0; i < arrSize; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    totalBribes++;
                }
            }
        }

        System.out.println(totalBribes);
    }


}
