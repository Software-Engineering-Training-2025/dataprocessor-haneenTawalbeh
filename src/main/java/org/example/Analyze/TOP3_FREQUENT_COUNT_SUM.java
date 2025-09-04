package org.example.Analyze;

import java.util.*;

public class TOP3_FREQUENT_COUNT_SUM implements AnalysisType {

    @Override
    public double analysis( List<Integer> data) {

        if (data.isEmpty()) {
            System.out.println(" 0.0.");
        }
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : data) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(freqMap.entrySet());
        sorted.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }
            return a.getKey() - b.getKey();
        });
        int sum = 0;
        for (int i = 0; i < Math.min(3, sorted.size()); i++) {
            sum += sorted.get(i).getValue();
        }

        return sum;
    }

    }

