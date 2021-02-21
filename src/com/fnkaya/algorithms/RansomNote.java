package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RansomNote {

    public static void main(String[] args) {
        String[] magazine = "give me one grand today night".split(" ");
        String[] ransom = "give one grand today".split(" ");

        checkMagazine(magazine, ransom);
    }

    static void checkMagazine(String[] magazine, String[] note) {
        Arrays.sort(magazine);
        Arrays.sort(note);
        List<String> magazineList = new ArrayList<>(List.of(magazine));
        List<String> noteList = List.of(note);
        boolean result = true;

        for (String word : note) {
            result = magazineList.remove(note);
        }

        System.out.println(true ? "Yes" : "No");
    }
}
