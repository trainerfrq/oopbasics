package com.trainerfrq.oop.inheritance.ctors;

public class SuperClass {
    public SuperClass() {
        System.out.println("super default ctor");
    }

    public SuperClass(String message) {
        System.out.println("Init SuperClass");
    }

    public void publicMethod() {
    }

    protected void protectedMethod() {
    }

    private void privateMethod() {
    }

    void packagePrivateMethod() {
    }
}
