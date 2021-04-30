package com.fnkaya.algorithms;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(s, "[ .,?!']+");
        System.out.println(tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        scan.close();
    }
}
