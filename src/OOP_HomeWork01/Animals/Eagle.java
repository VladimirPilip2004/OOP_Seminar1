package OOP_HomeWork01.Animals;

import OOP_HomeWork01.impl.Illable;
import OOP_HomeWork01.impl.Runnable;
import OOP_HomeWork01.impl.Flyable;
import OOP_HomeWork01.impl.Speakable;
import OOP_HomeWork01.Parent.Animal;

public class Eagle extends Animal implements Flyable, Illable, Speakable, Runnable {
    public Eagle(String name, String color) {
        super(name, color, 2);
    }

    public Eagle(String name) {
        this(name, null);
    }

    @Override
    public void hunt() {
    }

    @Override
    public void speak() {
        System.out.println("Иии!");
    }

    @Override
    public int getFlightSpeed() {
        return 40;
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getRunSpeed() {
        return 5;
    }


}

