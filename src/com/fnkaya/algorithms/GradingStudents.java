package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    public static void main(String[] args) {
        gradingStudents(new ArrayList<>(List.of(73, 67, 38, 33)));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> collect = grades.stream()
                .map(grade ->
                        grade < 38 || grade % 5 < 3 ? grade : grade + (5 - grade % 5))
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        return collect;
    }
}
