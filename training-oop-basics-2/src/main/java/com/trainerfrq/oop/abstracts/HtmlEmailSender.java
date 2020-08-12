package com.trainerfrq.oop.abstracts;

public class HtmlEmailSender extends EmailSender {
    @Override
    public String format(final String message) {
        return "<html><body>" + message + "</body></html>";
    }
}
