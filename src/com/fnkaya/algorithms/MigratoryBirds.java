package com.fnkaya.algorithms;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MigratoryBirds {

    public static void main(String[] args) {
        int result = migratoryBirds(new ArrayList<>(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
        System.out.println(result);
    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = arr.stream()
                .collect(Collectors.toMap(item -> item, item -> 1, Integer::sum));

        Map.Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());

        return maxEntry.getKey();
    }
}
