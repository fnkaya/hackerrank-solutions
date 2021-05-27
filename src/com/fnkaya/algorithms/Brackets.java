package com.fnkaya.algorithms;

import java.util.*;

public class Brackets {

    public static void main(String[] args) {
        Parser parser = new Parser();

        System.out.println(parser.isBalanced("({()})"));
    }

    static class Parser {

        private final Set<Character> leftCharacters = new HashSet<>(List.of('{', '('));
        private final Set<Character> rightCharacter = new HashSet<>(List.of('}', ')'));

        public boolean isBalanced(String string) {
            ArrayDeque<Character> stack = new ArrayDeque<>();

            for (int i = 0; i < string.length() ; i++) {
                char character = string.charAt(i);

                if (stack.isEmpty() || leftCharacters.contains(character))
                    stack.push(character);

                else if (rightCharacter.contains(character) && charactersAreOpposite(stack.peek(), character))
                    stack.pop();

                else
                    return false;
            }

            return stack.isEmpty();
        }

        public boolean charactersAreOpposite(Character c1, Character c2) {
            return (c1.equals('{') && c2.equals('}')) || (c1.equals('(') && c2.equals(')'));
        }
    }
}
