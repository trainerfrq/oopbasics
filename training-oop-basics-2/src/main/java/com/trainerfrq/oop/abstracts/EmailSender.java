package com.trainerfrq.oop.abstracts;

public abstract class EmailSender extends MessageSender {
    @Override
    public void send(String message) {
        String formattedMessage = format(message);
        System.out.println("Sending email: " + formattedMessage);
    }
}
