package ru.student1.task2;

public class Main {

    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        System.out.println(cat);
        cat.play();
        System.out.println(cat);
        cat.play();
    }
}
