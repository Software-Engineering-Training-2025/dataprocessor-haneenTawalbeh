package org.example.Analyze;

import java.util.Collections;
import java.util.List;

public class P90_NEAREST_RANK implements AnalysisType {

    @Override
    public double analysis( List<Integer> data) {

        if (data.isEmpty()) {
            System.out.println(" NaN.");
        }
        Collections.sort(data);
        int n = data.size();
        int rank =(int) Math.ceil(0.90 * n);
        return  data.get(rank - 1);

    }
}
