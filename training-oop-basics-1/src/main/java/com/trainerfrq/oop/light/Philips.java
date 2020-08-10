package com.trainerfrq.oop.light;

public class Philips extends Light {
    @Override
    public void on() {
        System.out.println("Turning Philips light on");
    }

    @Override
    public void off() {
        System.out.println("Turning Philips light off");
    }

    @Override
    public void dim() {
        System.out.println("Dimming Philips light");
    }
}
