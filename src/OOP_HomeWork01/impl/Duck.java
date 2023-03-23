package OOP_HomeWork01.impl;

import OOP_HomeWork01.Animal;
import OOP_HomeWork01.Flyable;
import OOP_HomeWork01.Illable;

public class Duck extends Animal implements Flyable, Illable {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Кря-кря!");
    }

    @Override
    public void hunt() {

    }

    public void fly() {
        System.out.println("Полетели!!!");
    }

    @Override
    public int getFlightSpeed() {
        return 10;
    }

    @Override
    public void getIll() {

    }
}
