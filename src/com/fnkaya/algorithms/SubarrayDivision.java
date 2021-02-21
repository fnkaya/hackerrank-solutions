package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {

    public static void main(String[] args) {
        System.out.println(birthday(new ArrayList<>(List.of(1, 2, 1, 3, 2)), 3, 2));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            System.out.print("i: " + i + " => ");

            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
                System.out.print("j: " + s.get(j) + ", ");
            }

            if (sum == d){
                result++;
                System.out.print("**");
            }
            System.out.println("sum: " + sum);
        }

        return result;
    }
}
