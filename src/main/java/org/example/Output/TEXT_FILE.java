package org.example.Output;

import java.io.FileWriter;
import java.io.IOException;

public class TEXT_FILE implements OutputType {
    @Override
    public void output(double data) {
        try (FileWriter writer = new FileWriter("target/result.txt", true)) {
            writer.write("Result = <\"+data+\">");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

}
