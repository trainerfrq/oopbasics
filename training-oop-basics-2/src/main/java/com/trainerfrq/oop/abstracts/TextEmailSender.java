package com.trainerfrq.oop.abstracts;

public class TextEmailSender extends EmailSender {
    @Override
    public String format(final String message) {
        return message;
    }
}
