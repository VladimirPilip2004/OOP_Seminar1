package OOP_HomeWork01;

import OOP_HomeWork01.impl.Cat;
import OOP_HomeWork01.impl.Dog;
import OOP_HomeWork01.impl.Duck;
//import OOP_HomeWork01.impl.Albatross;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat kat = new Cat("Тефтелька");

        List<Animal> animals = new ArrayList<>();
        animals.add(kat);
        animals.add(new Dog("Барбос"));
        animals.add(new Duck("Антонио"));
//        animals.add(new Albatross("Алик"));

        kat.hunt();
    }
}