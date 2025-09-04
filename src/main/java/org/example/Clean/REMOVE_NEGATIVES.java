package org.example.Clean;


import java.util.List;

public class REMOVE_NEGATIVES implements CleaningType {
    @Override
    public List<Integer> clean(List<Integer> input) {
        input.removeIf(i -> i < 0);
        return input;
    }

}
