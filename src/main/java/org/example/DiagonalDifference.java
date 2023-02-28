package org.example;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static int computeDifference(List<List<Integer>> theMatrix) {
        //Get values we care about in order
        List<Integer> downHillvalues = new ArrayList<>();
        List<Integer> upHillvalues = new ArrayList<>();
        for(int i = 0; i < theMatrix.size(); i++) {
            for(int j = 0; j < theMatrix.get(i).size(); j++){
                boolean isDownHillValueWeCareAbout = i == j;
                int theCountMinusOne = theMatrix.get(i).size() - 1;
                boolean isUpHillValueWeCareAbout = i + j == theCountMinusOne;
                if(isDownHillValueWeCareAbout){
                    downHillvalues.add(theMatrix.get(i).get(j));
                }
                if (isUpHillValueWeCareAbout) {
                    upHillvalues.add(theMatrix.get(i).get(j));
                }
            }
        }
        //Sum the values and return the absolute value diff
        int downhillValue = downHillvalues.stream().reduce(0, (memo, eachValue) -> memo + eachValue);
        int uphillValue = upHillvalues.stream().reduce(0, (memo, eachValue) -> memo + eachValue);
        return Math.abs(downhillValue - uphillValue);
    }
}
