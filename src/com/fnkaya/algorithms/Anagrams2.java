package com.fnkaya.algorithms;


public class Anagrams2 {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "margana") ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        java.util.Map<Character, Integer> map = new java.util.HashMap<>();

        for (Character c : b.toCharArray()) {
            if (!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c) + 1);
        }

        for (Character c : a.toCharArray()) {
            if (!map.containsKey(c))
                return false;

            if (map.get(c) == 0)
                return false;
            else
                map.put(c, map.get(c) - 1);
        }

        return true;
    }
}
