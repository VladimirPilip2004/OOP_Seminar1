package OOP_HomeWork01.Veterinary;

import OOP_HomeWork01.impl.Speakable;
import OOP_HomeWork01.impl.Runnable;
import OOP_HomeWork01.impl.Flyable;
import OOP_HomeWork01.impl.Swimable;
import OOP_HomeWork01.Parent.Animal;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryHospital {
    private final List<Animal> animals;

    // Конструктор
    public VeterinaryHospital() {
        this.animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    // Метод позволяющий принимать в клинику нового пациента
    public VeterinaryHospital addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

    // Метод получения всех летающих животных
    public List<Flyable> getFlyable() {
        List<Flyable> flyables = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable)
                flyables.add((Flyable) animal);
        }
        return flyables;
    }

    // Метод получения всех бегающих животных
    public List<Runnable> getRunable() {
        List<Runnable> runnables = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Runnable)
                runnables.add((Runnable) animal);
        }
        return runnables;
    }

    // Метод получения всех плавающих животных
    public List<Swimable> getSwimable() {
        List<Swimable> swimables = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable)
                swimables.add((Swimable) animal);
        }
        return swimables;
    }

    // Метод получения всех говорящих животных
    public List<Speakable> getSpeakable() {
        List<Speakable> speakables = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Speakable)
                speakables.add((Speakable) animal);
        }
        return speakables;
    }
}
