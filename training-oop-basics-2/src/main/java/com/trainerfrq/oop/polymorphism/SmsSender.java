package com.trainerfrq.oop.polymorphism;


public class SmsSender extends MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
