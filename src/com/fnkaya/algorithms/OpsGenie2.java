package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.List;

public class OpsGenie2 {

    public static void main(String[] args) {
        System.out.println(numberOfAlerts(3, 5, new ArrayList<>(List.of(0, 18, 10, 10, 7, 6))));
    }

    public static int numberOfAlerts(int precedingMinutes, int alertThreshold, List<Integer> numCalls) {
        List<Integer> list = new ArrayList<>();
        int alertCounter = 0;

        int sum = 0;
        for (int i = 0; i < numCalls.size() ; i++) {

           if (i % precedingMinutes != 0 || i == 0) {
               sum += numCalls.get(i);
           }
           else {
               sum += numCalls.get(i) - numCalls.get(i - precedingMinutes);
           }

            if (i >= precedingMinutes - 1 && sum / precedingMinutes >= alertThreshold)
                alertCounter++;
        }

        return alertCounter;
    }
}