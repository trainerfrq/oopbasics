package com.trainerfrq.oop.abstracts;

public class Main {
    public static void main(String[] args) {
        MessageSender textSender = new TextEmailSender();
        MessageSender htmlSender = new HtmlEmailSender();
        MessageSender smsSender = new SmsSender();

        String message = "some random text";

        textSender.send(message);   // Sending email: some random text
        htmlSender.send(message);   // Sending email: <html><body>some random text</body></html>
        smsSender.send(message);    // Sending SMS: some random text

    }
}
