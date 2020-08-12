package com.trainerfrq.oop.polymorphism;

public class EmailSender extends MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
