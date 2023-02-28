package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {
    public static void compute(List<Integer> arr) {
        List<Long> highestSum = new ArrayList<>(List.copyOf(arr))
                .stream()
                .mapToLong(Integer::longValue)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        //Remove the smallest value
        highestSum.remove(0);
        Long highestSumValue = highestSum.stream().reduce(Long::sum).orElse(0L);

        List<Long> lowestSum = new ArrayList<>(List.copyOf(arr))
                .stream()
                .mapToLong(Integer::longValue)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        //Remove the largest value
        lowestSum.remove(0);
        Long lowestSumValue = lowestSum.stream().reduce(Long::sum).orElse(0L);

        System.out.println(lowestSumValue + " " + highestSumValue);
    }
}
