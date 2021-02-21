package com.fnkaya.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Anagrams {

    public static void main(String[] args) {
        int result = sherlockAndAnagrams("ifailuhkqq");
        System.out.println(result);
    }

    private static int sherlockAndAnagrams(String s) {
        Map<String, Integer> map = new HashMap<>();
        int counter = 0;

        for (int slice = 1; slice < s.length(); slice++) {
            System.out.print("#Slice: " + slice + "#\n");

            for (int begin = 0; begin < s.length() - slice; begin++) {
                String substring = s.substring(begin, begin + slice);
                System.out.print("#Begin: (" + substring + ")# ");

                for (int trav = begin + 1; trav <= s.length() - slice; trav++) {
                    String travSubstring = s.substring(trav, trav + slice);
                    String reverseTravSubstring = new StringBuilder(travSubstring).reverse().toString();
                    System.out.print("Trav: (" + travSubstring + "-" + reverseTravSubstring
                            + ") ");
                    if (substring.equals(travSubstring) || substring.equals(reverseTravSubstring)){
                        counter++;
                        System.out.print("[+1]");
                    }
                    System.out.print(" - ");
                }
                System.out.println();
            }
        }

        return counter;
    }

}
