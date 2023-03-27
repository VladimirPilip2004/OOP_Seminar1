package OOP_HomeWork01;

import OOP_HomeWork01.Animals.*;
import OOP_HomeWork01.Human.Doctor;
import OOP_HomeWork01.Veterinary.VeterinaryHospital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryHospital VeterinaryHospital = new VeterinaryHospital();
        VeterinaryHospital
                .addAnimal(new Albatross("Алик"))
                .addAnimal(new Cat("Тефтелька"))
                .addAnimal(new Dog("Барбос"))
                .addAnimal(new Dorado("Дора"))
                .addAnimal(new Duck("Антонио"))
                .addAnimal(new Eagle("Быстрый"))
                .addAnimal(new Elephant("Бэмбо"))
                .addAnimal(new Fish("Рыбка"))
                .addAnimal(new Hawk("Зоркий"))
                .addAnimal(new Shark("Челюсть"));

        System.out.println("Runnable animals: " + VeterinaryHospital.getRunable());
        System.out.println("Swimming animals: " + VeterinaryHospital.getSwimable());
        System.out.println(("Speaking animals: " + VeterinaryHospital.getSpeakable()));
        System.out.println("Flying animals: " + VeterinaryHospital.getFlyable());
        System.out.println("All animals in Clinic: " + VeterinaryHospital.getAnimals());


        System.out.println("\nRunning animals:");
        for (OOP_HomeWork01.impl.Runnable r: VeterinaryHospital.getRunable()) {
            System.out.println(r + " " + r.getRunSpeed());
        }
        System.out.println("\nSwimming animals:");
        for (OOP_HomeWork01.impl.Swimable s: VeterinaryHospital.getSwimable()) {
            System.out.println(s + " " + s.getSwimSpeed());
        }
        System.out.println("\nFlying animals:");
        for (OOP_HomeWork01.impl.Flyable f: VeterinaryHospital.getFlyable()) {
            System.out.println(f + " " + f.getFlightSpeed());
        }

        System.out.println();
        System.out.println("Приём ведут:");

        Doctor semenov = new Doctor("Семёнов Максим Викторович", "Хирург");
        Doctor nikolaev = new Doctor("Николаев Василий Петрович", "Терапевт");


        List<Doctor> doctors = new ArrayList<>();
        doctors.add(semenov);
        doctors.add(nikolaev);


        System.out.println(doctors);

    }
}
