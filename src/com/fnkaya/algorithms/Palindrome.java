package com.fnkaya.algorithms;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(solution(new ArrayList<>(List.of("tea", "tea", "aaabbccd")), new ArrayList<>(List.of("ate", "toe", "aaaaccee"))));
    }

    public static List<Integer> solution(List<String> listA, List<String> listB) {
        List<Integer> resultList = new ArrayList<>();

        Map<Character, Integer> letterMapA = new HashMap<>();
        Map<Character, Integer> letterMapB = new HashMap<>();

        for (int i = 0; i < listA.size(); i++) {
            letterMapA.clear();
            letterMapB.clear();

            String stringValueA = listA.get(i);
            String stringValueB = listB.get(i);

            if (stringValueA.length() != stringValueB.length()) {
                resultList.add(-1);
            }
            else {
                char[] charsA = stringValueA.toCharArray();
                char[] charsB = stringValueB.toCharArray();

                for (int k = 0; k < charsA.length ; k++) {
                    char charA = charsA[k];
                    char charB = charsB[k];

                    if (!letterMapA.containsKey(charA))
                        letterMapA.put(charA, 1);
                    else
                        letterMapA.put(charA, letterMapA.get(charA) + 1);

                    if (!letterMapB.containsKey(charB))
                        letterMapB.put(charB, 1);
                    else
                        letterMapB.put(charB, letterMapB.get(charB) + 1);
                }

                Integer diff = letterMapA
                        .keySet()
                        .stream()
                        .filter(keyA -> !letterMapB.containsKey(keyA) || (letterMapB.containsKey(keyA) && letterMapA.get(keyA) > letterMapB.get(keyA)))
                        .map(key -> {
                            if (!letterMapB.containsKey(key))
                                return letterMapA.get(key);
                            else
                                return letterMapA.get(key) - letterMapB.get(key);
                        })
                        .reduce(0, Integer::sum);

                resultList.add(diff);
            }
        }

        return resultList;
    }
}
