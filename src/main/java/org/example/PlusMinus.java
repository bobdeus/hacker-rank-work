package org.example;

import java.util.List;

public class PlusMinus {
    public static void computeValues(List<Integer> arr) {
        // Write your code here
        int countOfPositives = 0;
        int countOfNegatives = 0;
        int countOfZeros = 0;

        for (int each : arr) {
            if (each > 0) {
                countOfPositives++;

            } else if (each < 0) {
                countOfNegatives++;

            } else {
                countOfZeros++;
            }
        }


        System.out.printf("%.6f%n", (float) countOfPositives / arr.size());

        System.out.printf("%.6f%n", (float) countOfNegatives / arr.size());

        System.out.printf("%.6f%n", (float) countOfZeros / arr.size());

    }
}
