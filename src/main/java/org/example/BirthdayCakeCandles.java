package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static int getNumberOfCandles(List<Integer> candles) {
        List<Integer> sortedCandles = new ArrayList<>();
        for (Integer candle : candles) {
            sortedCandles.add(candle);
        }
        sortedCandles.sort(Collections.reverseOrder());
        int tallestCandleSize = sortedCandles.get(0);

        return sortedCandles.stream().reduce(0, (memo, candleSize) -> {
            if (candleSize == tallestCandleSize) {
                return ++memo;
            } else {
                return memo;
            }
        });
    }
}
