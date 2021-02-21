package com.fnkaya.algorithms;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class TwoStrings {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        String result = twoStrings(s1, s2);

        System.out.println(result);
    }

    private static String twoStrings(String s1, String s2) {
        Set<Character> list1 = new HashSet<>();
        Set<Character> list2 = new HashSet<>();
        boolean result;

        for (char c: s1.toCharArray())
            list1.add(c);

        for (char c: s2.toCharArray())
            list2.add(c);

        result = list1.stream().anyMatch(list2::contains);

        return result ? "YES" : "NO";
    }
}
