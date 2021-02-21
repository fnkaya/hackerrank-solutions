package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.List;

public class AliceBob {

    public static void main(String[] args) {
        List<Integer> result = compareTriplets(new ArrayList<>(List.of(17, 28, 30)), new ArrayList<>(List.of(99, 16, 8)));

        System.out.println(result);
    }

    public static List<Integer> compareTriplets(List<Integer> alice, List<Integer> bob) {
        int alicesPoint = 0;
        int bobsPoint = 0;

        for (int i = 0; i < alice.size(); i++) {
            int comp = alice.get(i) - bob.get(i);

            if (comp > 0)
                alicesPoint++;
            else if (comp < 0)
                bobsPoint++;
        }

        return List.of(alicesPoint, bobsPoint);
    }
}
