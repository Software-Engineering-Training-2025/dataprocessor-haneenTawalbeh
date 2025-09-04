package org.example.dataprocessor;

import org.example.Analyze.AnalysisType;
import org.example.Output.OutputType;
import org.example.dataprocessor.enums.CleaningType;

import java.util.*;
import java.util.List;


/**
 * Students ONLY implement the process(...) method below.
 *
 * Requirements:
 * - Order: Clean -> Analyze -> Output -> Return result
 * - Do NOT mutate the original input list
 * - Handle empties as specified in AnalysisType docs
 * - Output format EXACTLY: "Result = <value>"
 * - TEXT_FILE path: target/result.txt (create parent dirs, overwrite file)
 */
public class DataProcessorService {

    private CleaningType clean;
    private AnalysisType analyze;
    private OutputType output;

    public double process(CleaningType cleaningType, AnalysisType analysisType, OutputType outputType, List<Integer> data) throws Exception {
        this.clean = cleaningType ;
        this.analyze = analysisType;
        this.output = outputType;





        // TODO: implement using the enums only (no long if/else ladders required,
        // but minimal branching to select behavior by enum is acceptable in this task).
        // Steps:
        // 1) Copy & clean data according to cleaningType.
        // 2) Analyze cleaned array according to analysisType.
        // 3) Output according to outputType (console or target/result.txt).
        // 4) Return the numeric result.

        throw new UnsupportedOperationException("Student must implement process(...)");
    }

    List<Integer> clean(List<Integer> input){
        return clean(input);

    }
    double analysis(List<Integer> input){
        return analyze.analysis(input);
    }
    void output( double data){
        output.output(data);
    }


}

