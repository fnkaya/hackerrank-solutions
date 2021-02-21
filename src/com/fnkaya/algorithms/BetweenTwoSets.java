package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

    public static void main(String[] args) {
        int result = getTotalX(new ArrayList<>(List.of(2, 4)),
                new ArrayList<>(List.of(16, 32, 96)));

        System.out.println(result);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        List<Integer> c = new ArrayList<>();
        for(int i : a){
            c.add(i);
        }
        for(int j : b){
            c.add(j);
        }
        int numBetweenSets = 0;
        int firstFactorForA = a.get(a.size()-1);
        for(int i = firstFactorForA; i<=b.get(0); i+=a.get(a.size()-1)){
            int count = 0;
            for(int j = 0; j<c.size();j++) {
                int greaterNum = (c.get(j)>i) ? c.get(j) : i;
                int smallerNum = (c.get(j)<i) ? c.get(j) : i;
                if (greaterNum % smallerNum==0) {
                    count++;
                    if(count==c.size()){
                        numBetweenSets++;
                    }
                }
            }

        }
        return numBetweenSets;
    }
}
