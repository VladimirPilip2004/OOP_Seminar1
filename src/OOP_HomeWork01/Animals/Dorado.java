package OOP_HomeWork01.Animals;

import OOP_HomeWork01.impl.Illable;
import OOP_HomeWork01.impl.Swimable;
import OOP_HomeWork01.Parent.Animal;

public class Dorado extends Animal implements Swimable, Illable {
    public Dorado(String name, String color) {
        super(name, color, 0);
    }

    public Dorado(String name) {
        super(name, null, 0);
    }

    @Override
    public void hunt() {
    }

    @Override
    public int getSwimSpeed() {
        return 20;
    }

    @Override
    public void getIll() {

    }
}

