package com.trainerfrq.oop.polymorphism;

public class MessageSender {
    public void send(String message) {
        System.out.println("Sending: " + message);
    }

    public static void main(String[] args) {
        String message = "some message";

        MessageSender[] senders = new MessageSender[] {
                new MessageSender(),
                new SmsSender(),
                new EmailSender()
        };

        for (MessageSender sender : senders) {
            sender.send(message);
        }
    }
}
