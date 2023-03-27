package OOP_HomeWork01.Animals;

import OOP_HomeWork01.Parent.Animal;
import OOP_HomeWork01.impl.Flyable;
import OOP_HomeWork01.impl.Illable;
import OOP_HomeWork01.impl.Speakable;

public class Duck extends Animal implements Flyable, Illable, Speakable {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Кря-Кря!");
    }

    @Override
    public void hunt() {

    }

    public void fly() {
        System.out.println("Полетели!");
    }

    @Override
    public int getFlightSpeed() {
        return 10;
    }

    @Override
    public void getIll() {

    }
}
