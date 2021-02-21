package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> squareMatrix =
                new ArrayList<>(List.of(new ArrayList<>(List.of(1, 2, 3)),
                        new ArrayList<>(List.of(4, 5, 6)),
                        new ArrayList<>(List.of(9, 8, 9))));

        int result = diagonalDifference(squareMatrix);

        System.out.println(result);
    }

    private static int diagonalDifference(List<List<Integer>> arr) {
        int ltr = 0, rtl = 0;

        for (int i = 0; i < arr.size(); i++) {
            ltr += arr.get(i).get(i);
            rtl += arr.get(i).get(arr.size() - (i + 1));
        }

        return Math.abs((ltr - rtl));
    }
}
