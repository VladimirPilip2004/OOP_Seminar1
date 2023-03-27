package OOP_HomeWork01.Parent;

import OOP_HomeWork01.impl.Illable;

public abstract class Human implements Illable {
    private String name;

    @Override
    public void getIll() {
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
