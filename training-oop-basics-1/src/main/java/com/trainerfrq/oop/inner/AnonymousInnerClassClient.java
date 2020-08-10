package com.trainerfrq.oop.inner;

public class AnonymousInnerClassClient {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        };

        runnable.run();
    }
}
