package com.trainerfrq.oop.interfaces.extend;

public class Greeter implements Bye {
    @Override
    public String sayHi() {
        return "Hi";
    }

    @Override
    public String sayBye() {
        return "Bye";
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHi());
        System.out.println(greeter.sayBye());
    }
}
