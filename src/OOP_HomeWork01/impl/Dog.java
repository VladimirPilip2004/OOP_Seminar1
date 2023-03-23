package OOP_HomeWork01.impl;

import OOP_HomeWork01.Animal;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color,4);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Гав-гав!");
    }

    @Override
    public void hunt() {

    }
}

