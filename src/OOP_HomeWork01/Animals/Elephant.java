package OOP_HomeWork01.Animals;

import OOP_HomeWork01.Parent.Animal;
import OOP_HomeWork01.impl.Illable;
import OOP_HomeWork01.impl.Speakable;
import OOP_HomeWork01.impl.Runnable;

public class Elephant extends Animal implements Runnable, Illable, Speakable {
    public Elephant(String name, String color) {
        super(name, color, 4);
    }

    public Elephant(String name) {
        this(name, null);
    }

    @Override
    public void hunt() {
    }

    @Override
    public void speak() {
        System.out.println("IIIIIIUUUUUU!");
    }

    @Override
    public void getIll() {
    }


    @Override
    public int getRunSpeed() {
        return 30;
    }
}