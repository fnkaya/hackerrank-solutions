package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Candles {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(3, 2, 1, 3));

        int result = candles(arr);

        System.out.println(result);
    }

    private static int candles(ArrayList<Integer> candles) {
        Integer maxValue = candles.stream().max(Comparator.naturalOrder()).get();
        long count = candles.stream().filter(item -> item.equals(maxValue)).count();
        return (int) count;
    }
}
