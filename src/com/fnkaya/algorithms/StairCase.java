package com.fnkaya.algorithms;

public class StairCase {

    public static void main(String[] args) {
        staircase(6);
    }

    private static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(new String(new char[n-i]).replace("\0", " ") + new String(new char[i]).replace("\0", "#"));
        }
    }
}
