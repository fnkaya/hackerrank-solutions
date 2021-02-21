package com.fnkaya.algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AppleAndOrange {

    public static void main(String[] args) {
        countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
    }

    public static void countApplesAndOranges(int houseLeft, int houseRight, int appleTree, int orangeTree, int[] apples, int[] oranges) {
        long appleCount = Arrays.stream(apples)
                .map(apple -> appleTree + apple)
                .filter(apple -> apple >= houseLeft && apple <= houseRight)
                .count();

        long orangeCount = Arrays.stream(oranges)
                .map(orange -> orangeTree + orange)
                .filter(orange -> orange >= houseLeft && orange <= houseRight)
                .count();

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
