package com.trainerfrq.oop.light;

public class Client {
    public static void main(String[] args) {
        Light light = new Osram();
        light.on();
        light.dim();
        light.off();
    }
}
