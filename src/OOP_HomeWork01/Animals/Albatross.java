package OOP_HomeWork01.Animals;

import OOP_HomeWork01.Parent.Animal;
import OOP_HomeWork01.impl.Flyable;
import OOP_HomeWork01.impl.Illable;
import OOP_HomeWork01.impl.Speakable;

public class Albatross extends Animal implements Flyable, Illable, Speakable {
    public Albatross(String name, String color) {
        super(name, color,2);
    }

    public Albatross(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("ААААА!");
    }

    @Override
    public void hunt() {

    }

    public void fly() {
        System.out.println("Летим!");
    }

    @Override
    public int getFlightSpeed() {
        return 10;
    }

    @Override
    public void getIll() {

    }
}
