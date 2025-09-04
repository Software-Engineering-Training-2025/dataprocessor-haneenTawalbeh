package org.example.Analyze;

import java.util.ArrayList;
import java.util.List;

public class STD_DEV implements AnalysisType {
    @Override
    public double analysis( List<Integer> data) {

        if (data.isEmpty()) {
            System.out.println(" NaN.");
        }

        MEAN meanCalculator  = new MEAN();
        double mean1 = meanCalculator.analysis( data);

        List<Integer> newList = new ArrayList<>();
        for (int i : data) newList.add((int) Math.pow((i - mean1), 2));

        double mean2 = meanCalculator.analysis(newList);
        return Math.sqrt(mean2);






    }
}
