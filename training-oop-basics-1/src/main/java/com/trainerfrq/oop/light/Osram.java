package com.trainerfrq.oop.light;

public class Osram extends Light {
    @Override
    public void on() {
        System.out.println("Turning Osram light on");
    }

    @Override
    public void off() {
        System.out.println("Turning Osram light off");
    }

    @Override
    public void dim() {
        System.out.println("Dimming Osram light");
    }
}
