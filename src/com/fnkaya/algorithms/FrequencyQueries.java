package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQueries {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>(List.of(
                new ArrayList<>(List.of(1, 1)),
                new ArrayList<>(List.of(2, 2)),
                new ArrayList<>(List.of(3, 2)),
                new ArrayList<>(List.of(1, 1)),
                new ArrayList<>(List.of(1, 1)),
                new ArrayList<>(List.of(2, 1)),
                new ArrayList<>(List.of(3, 2)))
        );

        List<Integer> resultList = freqQuery(list);

        resultList.forEach(item -> System.out.print(item + " "));
    }

    public static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> freq = new ArrayList<>();

        for (List<Integer> query : queries) {
            int operator = query.get(0);
            int operand = query.get(1);

            if (operator == 1) {
                map.putIfAbsent(operand, 0);
                freq.remove(map.get(operand));

                map.put(operand, map.get(operand) + 1);
                freq.add(map.get(operand));

            } else if (operator == 2) {

                if (map.containsKey(operand) && map.get(operand) > 0) {
                    freq.remove(map.get(operand));
                    map.put(operand, map.get(operand) - 1);
                    freq.add(map.get(operand));
                }

            } else {
                result.add(freq.contains(operand) ? 1 : 0);
            }
        }

        return result;
    }
}
