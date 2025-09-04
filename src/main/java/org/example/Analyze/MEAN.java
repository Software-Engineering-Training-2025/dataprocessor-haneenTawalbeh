package org.example.Analyze;

import java.util.List;

public class MEAN implements AnalysisType {
    @Override
    public double analysis( List<Integer> data) {



        if (data.isEmpty()) {
            System.out.println(" NaN.");
        }
        int sum = 0;
        for (int i : data) sum += i;
        return sum / data.size();



    }
}
