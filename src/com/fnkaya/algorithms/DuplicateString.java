package com.fnkaya.algorithms;

import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class DuplicateString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        long n = scanner.nextLong();

        long result = repeatedString(s, n);

        System.out.println("Result => " + result);
    }

    private static long repeatedString(String s, long n) {
        long numberOfRepeat = n / s.length();
        long numberOfRest = n % s.length();
        long numberOfDuplicatedAInEachString = 0;
        long totalNumberOfDuplicatedA = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                numberOfDuplicatedAInEachString++;
            }
        }

        for (int i = 0; i < numberOfRest; i++) {
            if (s.charAt(i) == 'a') {
                totalNumberOfDuplicatedA++;
            }
        }

        return totalNumberOfDuplicatedA + (numberOfDuplicatedAInEachString * numberOfRepeat);
    }
}
