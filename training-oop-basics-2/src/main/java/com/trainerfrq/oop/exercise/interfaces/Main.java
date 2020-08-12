package com.trainerfrq.oop.exercise.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                //... add some animals
        };

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + " says: " + animal.speak());
        }
    }
}
