package com.fnkaya.algorithms;

import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class FindMaximumIndexProduct {

    public static void main(String[] args) {
        System.out.println(solve(List.of(5, 4, 3, 4, 5)));
    }

    public static long solve(List<Integer> list) {
        int[] leftIndices = IntStream.range(0, list.size()).toArray();
        int[] rightIndices = IntStream.range(0, list.size()).map(index -> list.size() - index - 1).toArray();

        leftIndices = handleClosest(list.toArray(new Integer[0]), leftIndices);
        rightIndices = handleClosest(list.toArray(new Integer[0]), rightIndices);

        long maxProduct = Long.MIN_VALUE;
        for (int i = 0; i < leftIndices.length; i++) {
            maxProduct = Math.max(maxProduct, (long) leftIndices[i] * rightIndices[i]);
        }

        return maxProduct;
    }

    public static int[] handleClosest(Integer[] arr, int[] indices) {
        int[] closests = new int[arr.length];
        Stack<Integer> indexStack = new Stack<>();

        for (int index: indices) {
            while (!indexStack.empty() && arr[index] >= arr[indexStack.peek()]) {
                indexStack.pop();
            }

            closests[index] = indexStack.empty() ? 0 : indexStack.peek() + 1;
            indexStack.push(index);
        }

        return closests;
    }
}
