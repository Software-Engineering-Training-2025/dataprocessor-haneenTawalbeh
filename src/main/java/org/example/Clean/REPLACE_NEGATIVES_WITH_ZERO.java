package org.example.Clean;

import java.util.List;

public class REPLACE_NEGATIVES_WITH_ZERO implements CleaningType {
    public List<Integer> clean(List<Integer> input) {
        for(int i : input){
            if (i < 0) input.set(i, 0);
        }
        return input;
    }
}
