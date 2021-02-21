package com.fnkaya.algorithms;

public class MarsExploration {

    public static void main(String[] args) {
        int result = marsExploration("SOSSPSSQSSOR");
        System.out.println(result);
    }

    public static int marsExploration(String s) {
        String sos = "SOS";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sos.charAt(i % 3))
                count++;
        }

        return count;
    }
}
