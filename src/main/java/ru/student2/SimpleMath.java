package ru.student2;

import java.util.Scanner;

public class SimpleMath {

    public void startProgram(){
        printAllOperations();
        int operationNum = chooseOperation();

        double doubleValue = chooseFirstValue();
        float floatValue = chooseSecondValue();

        switch (operationNum){
            case (1):
                compareValues(doubleValue, floatValue);
                break;
            case (2):
                roundValues(doubleValue, floatValue);
                break;
            case (3):
                longValues(doubleValue, floatValue);
                break;
        }
    }

    private void printAllOperations(){
        System.out.println("Операции над double/float");
        System.out.println("1. Сравнить");
        System.out.println("2. Округлить");
        System.out.println("3. Отбросить дробную часть");
    }

    private int chooseOperation(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }

    private double chooseFirstValue(){
        System.out.println("Введите первое число:");
        Scanner in = new Scanner(System.in);
        double doubleValue = in.nextDouble();
        System.out.println(doubleValue);
        return doubleValue;
    }

    private float chooseSecondValue() {
        System.out.println("Введите второе число:");
        Scanner in = new Scanner(System.in);
        float floatValue = in.nextFloat();
        System.out.println(floatValue);
        return floatValue;
    }

    private void roundValues(double doubleValue, float floatValue){
        System.out.println("Результаты округления: " + doubleValue + " - " + Math.round(doubleValue) + ", "
                + floatValue + " - " + Math.round(floatValue));
    }

    private void longValues(double doubleValue, float floatValue){
        System.out.println("Результаты отброса дробной части: " + doubleValue + " - " + (long) doubleValue + ", "
        + floatValue + " - " + (long) floatValue);
    }

    private void compareValues(double doubleValue, float floatValue){
        StringBuilder floatString = new StringBuilder(Float.toString(floatValue));
        int size = floatString.length();
        for(;size<18;size++){
            floatString.append(0);
        }

        int result = Double.compare(doubleValue, Double.parseDouble(floatString.toString()));
        switch (result){
            case (0):
                System.out.println("Результат сравнения: числа равны");
                break;
            case (1):
                System.out.println("Результат сравнения: " + doubleValue + " больше " + floatValue);
                break;
            case (-1):
                System.out.println("Результат сравнения: " + doubleValue + " меньше " + floatValue);
                break;
        }
    }
}
