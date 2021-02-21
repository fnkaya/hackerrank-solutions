package com.fnkaya.algorithms;

public class NumberLineJumps {

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 2, 5, 3));
    }

    public static String kangaroo(int k1Position, int k1Jump, int k2Position, int k2Jump) {
        String result = "NO";

        if ((k1Position > k2Position && k1Jump >= k2Jump) || (k2Position > k1Position && k2Jump >= k1Jump)) {
            return result;
        }

        if ((k1Position - k2Position) % (k1Jump - k2Jump) == 0) {
            result = "YES";
        }

        return result;
    }
}
