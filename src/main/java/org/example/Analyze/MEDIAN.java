package org.example.Analyze;

import java.util.Collections;
import java.util.List;

public class MEDIAN implements AnalysisType {
    @Override
    public double analysis(List<Integer> data) {

        Collections.sort(data);
        if(data.size()% 2 == 1){
            return data.get(data.size()/2);
        }
        return (double) (data.get(data.size() / 2 - 1) + data.get(data.size() / 2)) / 2;
    }
}
