package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.List;

public class ArrayQuery {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>(
                List.of(
                        new ArrayList<>(List.of(1, 0, 5)),
                        new ArrayList<>(List.of(1, 1, 7)),
                        new ArrayList<>(List.of(1, 0, 3)),
                        new ArrayList<>(List.of(2, 1, 0)),
                        new ArrayList<>(List.of(2, 1, 1))
                )
        );

        List<Integer> result = dynamicArray(2, list);
        result.forEach(System.out::println);
    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAnswer = 0;
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        for (List<Integer> query : queries) {
            Integer q = query.get(0);
            Integer x = query.get(1);
            Integer y = query.get(2);
            int i = (x ^ lastAnswer) % n;

            if (q == 1) {
                arr.get(i).add(y);
            } else if (q == 2) {
                List<Integer> temp = arr.get(i);
                lastAnswer = temp.get(y % temp.size());
                result.add(lastAnswer);
            } else
                throw new IllegalArgumentException();
        }

        return result;
    }
}
