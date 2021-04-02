package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.List;

public class OpsGenie3 {

    public static void main(String[] args) {

        System.out.println(gameWinner("wwwbbbbwww"));
    }

    public static String gameWinner(String colors) {
        List<Integer> whiteIndexes = new ArrayList<>();
        List<Integer> blackIndexes = new ArrayList<>();

        for (int i = 0; i < colors.length() - 2; i++) {
            String substring = colors.substring(i, i + 3);

            if (substring.equals("www"))
                whiteIndexes.add(i);

            else if (substring.equals("bbb"))
                blackIndexes.add(i);
        }

        return (whiteIndexes.size() == blackIndexes.size()) ? "bob" : (whiteIndexes.size() > blackIndexes.size()) ? "wendy" : "bob";
    }
}
