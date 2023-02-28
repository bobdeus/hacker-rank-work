package org.example;

public class StairCase {
    public static void print(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            StringBuilder stringToPrint = new StringBuilder();

            for (int j = 0; j <= n - 1; j++) {
                if(j < n - i - 1) {
                    stringToPrint.append(" ");
                } else {
                    stringToPrint.append("#");
                }
            }
            System.out.println(stringToPrint);
        }
    }
}
