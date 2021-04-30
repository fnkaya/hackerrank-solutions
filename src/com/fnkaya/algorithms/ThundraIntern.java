package com.fnkaya.algorithms;

import java.util.*;

public class ThundraIntern{

    public static void main(String[] args) {
        int result = findBestCity(3, 3,  new ArrayList<Integer>(List.of(1, 2)), new ArrayList<Integer>(List.of(2, 3)), new ArrayList<Integer>(List.of(3, 1)));
        System.out.println(result);
    }

    public static int findBestCity(int distanceThreshold, int cityNodes, List<Integer> cityFrom, List<Integer> cityTo, List<Integer> cityWeight) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < cityWeight.size(); i++) {
            if (cityWeight.get(i) <= distanceThreshold) {
                int city1 = cityFrom.get(i);
                int city2 = cityTo.get(i);

                if (!map.containsKey(city1))
                    map.put(city1, 1);
                else
                    map.put(city1, map.get(city1) + 1);

                if (!map.containsKey(city2))
                    map.put(city2, 1);
                else
                    map.put(city2, map.get(city2) + 1);
            }
        }

        Optional<Map.Entry<Integer, Integer>> optionalEntrySet = map.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue());

        if (optionalEntrySet.isPresent()) {
            Integer minValue = optionalEntrySet.get().getValue();

            Optional<Integer> maxKey = map.keySet()
                    .stream()
                    .filter(key -> map.get(key).equals(minValue))
                    .max(Integer::compareTo);

            return maxKey.orElseThrow(IllegalArgumentException::new);
        }
        else throw new IllegalArgumentException();
    }
}
