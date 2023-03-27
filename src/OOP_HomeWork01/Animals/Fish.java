package OOP_HomeWork01.Animals;

import OOP_HomeWork01.impl.Illable;
import OOP_HomeWork01.impl.Swimable;
import OOP_HomeWork01.Parent.Animal;

public class Fish extends Animal implements Swimable, Illable {
    public Fish(String name, String color) {
        super(name, color, 0);
    }

    public Fish(String name) {
        super(name, null, 0);
    }

    @Override
    public void hunt() {
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }

    @Override
    public void getIll() {

    }
}
