package OOP_HomeWork01.impl;

import OOP_HomeWork01.Animal;
import OOP_HomeWork01.Illable;

import java.io.Serializable;

public class Cat extends Animal implements Illable {
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Мяу!");
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    protected void wakeUp() {
        System.out.println("Cat woke up..");
    }

    private void findFood() {
        System.out.println("Cat found food..");
    }

    private void eat() {
        System.out.println("Cat ate..");
    }

    public void toPlay() {
        System.out.println("Cat played..");
    }

    public void goToSleep() {
        System.out.println("Cat already asleep..");
    }

    @Override
    public void getIll() {
        System.out.printf("%s заболел", this.getName());
    }
}
