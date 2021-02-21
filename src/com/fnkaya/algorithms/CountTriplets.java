package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {

    public static void main(String[] args) {
        System.out.println(countTriplets(new ArrayList<>(List.of(1L, 5L, 5L, 25L, 125L)),5L));
    }

    public static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> map = new HashMap<>();
        long counter = 0;

        for (Long item : arr) {
            if (map.containsKey(item))
                map.put(item, map.get(item) + 1);
            else
                map.put(item, 1L);
        }

        for (Long item : arr) {
            boolean secondValue = map.containsKey(item * r);
            boolean thirdValue = map.containsKey(item * r * r);

            if (secondValue && thirdValue) {
                counter += map.get(item) * map.get(item * r) * map.get(item * r * r);
            }
        }

        return counter;
    }
}
