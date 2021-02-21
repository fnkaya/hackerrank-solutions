package com.fnkaya.algorithms;

public class CaesarCipher {

    public static void main(String[] args) {
        String result = caesarCipher("middle-Outz", 2);
        System.out.println(result);
    }

    public static String caesarCipher(String s, int k) {
        return s.codePoints()
                .map(code -> Character.isAlphabetic(code) ? check(code, k % 26) : code)
                .peek(System.out::println)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private static int check(int code, int k) {
        int newCode = code + k;

        if ((Character.isLowerCase(code) && newCode > 'z') ||
                (Character.isUpperCase(code) && newCode > 'Z'))
            newCode -= 26;

        return newCode;
    }
}
