package ru.student1.task3.reader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static void main(String[] args) throws IOException {
        String fword = "моркофель";
        String sword = "мандальсины";
        String filePath = "C:\\Users\\Давид\\IdeaProjects\\student\\src\\main\\resources\\input.txt";

        File file = new File(filePath);
        java.io.FileReader fileReader = new java.io.FileReader(file);
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
            System.out.println(text);
        }
    }
}
