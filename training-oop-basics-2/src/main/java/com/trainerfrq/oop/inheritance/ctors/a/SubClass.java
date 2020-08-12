package com.trainerfrq.oop.inheritance.ctors.a;

import com.trainerfrq.oop.inheritance.ctors.SuperClass;

public class SubClass extends SuperClass {
    private final int x;
    //    public SubClass(final String message) {
//        super(message);
//    }

    public SubClass() {
//        super("");
        System.out.println("init subclass");
        x = 100;
    }

//    public void method() {
//        privateMethod();                // ERROR, cannot access private method
//        packagePrivateMethod();         // ERROR, cannot access package private method
//    }
//    public void publicMethod() {     // ERROR, cannot decrease visibility
//        return "Hello" + x;
//    }


    @Override
    public void protectedMethod() {     // valid, can increase visibility
    }

    public static void main(String[] args) {
//        new SuperClass("");
//        System.out.println("-----");
        new SubClass();
    }
}

