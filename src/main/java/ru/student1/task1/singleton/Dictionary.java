package ru.student1.task1.singleton;

import java.util.HashMap;

public class Dictionary {

    private static Dictionary instance;

    public static Dictionary getInstance() {
        if(instance == null){
            instance = new Dictionary();
        }
        return instance;
    }

    private Dictionary() {
    }

    private final HashMap<String, String> translations = new HashMap<String, String>();

    public String getTranslation(String key){
        return translations.get(key);
    }

    public void addTranslation(String key, String value) {
        translations.put(key, value);
    }

}
