package com.trainerfrq.oop.exercise.inheritance;

public class Person {
    private String name;

    public Person(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isEntryAllowed() {
        return false;
    }
}
