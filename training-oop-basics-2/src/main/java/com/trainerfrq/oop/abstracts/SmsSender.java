package com.trainerfrq.oop.abstracts;

public class SmsSender extends MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }

    @Override
    public String format(String message) {
        return null;
    }
}
