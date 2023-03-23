package OOP_HomeWork01.impl;

import OOP_HomeWork01.Animal;
import OOP_HomeWork01.Flyable;
import OOP_HomeWork01.Illable;

public class Albatross extends Animal implements Flyable, Illable {
    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 100;
    }

    @Override
    public void getIll() {

    }
}
