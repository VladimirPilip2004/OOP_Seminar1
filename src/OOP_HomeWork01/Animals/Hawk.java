package OOP_HomeWork01.Animals;

import OOP_HomeWork01.impl.Illable;
import OOP_HomeWork01.impl.Flyable;
import OOP_HomeWork01.impl.Speakable;
import OOP_HomeWork01.impl.Runnable;
import OOP_HomeWork01.Parent.Animal;

public class Hawk extends Animal implements Flyable, Illable, Speakable, Runnable {
    public Hawk(String name, String color) {
        super(name, color, 2);
    }

    public Hawk(String name) {
        this(name, null);
    }

    @Override
    public void hunt() {
    }

    @Override
    public void speak() {
        System.out.println("Иииууу!");
    }

    @Override
    public int getFlightSpeed() {
        return 50;
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getRunSpeed() {
        return 7;
    }

}

