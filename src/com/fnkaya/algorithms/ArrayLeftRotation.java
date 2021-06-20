package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeftRotation {

    public static void main(String[] args) {
        rotateLeft(4, new ArrayList<>(List.of(1,2,3,4,5)))
                .forEach(System.out::println);
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int arrSize = arr.size();
        List<Integer> result = new ArrayList<>(arrSize);

        for (int i = 0; i < arrSize; i++) {
            int index = (i + d) % arrSize;
            result.add(arr.get(index));
        }

        return result;
    }
}
