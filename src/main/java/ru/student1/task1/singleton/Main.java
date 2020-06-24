package ru.student1.task1.singleton;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = Dictionary.getInstance();
        dictionary.addTranslation("Hello", "Привет");
        dictionary.addTranslation("Bye", "Пока");

        System.out.println(dictionary.getTranslation("Hello"));
        System.out.println(dictionary.getTranslation("Bye"));

    }
}
