package org.example.Output;

public class CONSOLE implements OutputType {
    @Override
    public void output(double data) {
        System.out.println("Result = <"+data+">");
    }
}
