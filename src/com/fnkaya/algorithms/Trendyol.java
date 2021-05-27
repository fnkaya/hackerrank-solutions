package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Trendyol {

    public static void main(String[] args) {
        System.out.println(createWord(20));
    }

    public static String createWord(int n) {
        StringBuilder sb = new StringBuilder();
        List<Character> odd = new ArrayList<>();
        List<Character> even = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (n - sb.length() == even.size()) {
                even.forEach(sb::append);
                break;
            }
            char letter = randomLetter();
            sb.append(letter);
            if (odd.contains(letter)) {
                odd.remove(Character.valueOf(letter));
                even.add(letter);
            }
            else if (even.contains(letter)) {
                even.remove(Character.valueOf(letter));
                odd.add(letter);
            }
            else {
                odd.add(letter);
            }
        }
        return sb.toString();
    }

    public static char randomLetter() {
        return (char) ((Math.random() * (123 - 97)) + 97);
    }
}
