package ru.student1.task2;

public class Cat {

    private boolean isHungry;
    private boolean isTired;

    public void eat(){
        isHungry = false;
    }

    public void sleep(){
        isTired = false;
    }

    public void play() throws Exception {
        if( isHungry == true | isTired == true) {
            throw new Exception("Cat is tired or hungry");
        }

        isTired = true;
        isHungry = true;
    }
}
