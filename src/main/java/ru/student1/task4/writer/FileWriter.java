package ru.student1.task4.writer;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        String fword = "моркофель";
        String sword = "мандальсины";
        String inputFilepath = "C:\\Users\\Давид\\IdeaProjects\\student\\src\\main\\resources\\input.txt";
        String outputFilepath = "C:\\Users\\Давид\\IdeaProjects\\student\\src\\main\\resources\\output.txt";

        File inputFile = new File(inputFilepath);
        java.io.FileReader fileReader = new java.io.FileReader(inputFile);
        BufferedReader reader = new BufferedReader(fileReader);

        List<String> result = new ArrayList<>();
        List<String> subResult = new ArrayList<>();

        String line = reader.readLine();
        int flag = 0;
        while (line != null) {
            if(line.equals(fword)){
                flag = 1;
            }
            if(flag == 0){
                result.add(line);
            }
            if(flag == 1){
                subResult.add(line);
            }
            if(line.equals(sword) && flag == 1){
                flag = 0;
                subResult = new ArrayList<>();
            }
            line = reader.readLine();
        }
        result.addAll(subResult);

        for(String text : result){
        }

        File outputFile = new File(outputFilepath);
        java.io.FileWriter fileWriter = new java.io.FileWriter(outputFile);
        for(String text : result){
            fileWriter.write(text + "\r\n");
        }
        fileWriter.close();

    }
}
