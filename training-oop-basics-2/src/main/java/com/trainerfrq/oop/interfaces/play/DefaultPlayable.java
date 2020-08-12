package com.trainerfrq.oop.interfaces.play;

public class DefaultPlayable implements Playable {
    @Override
    public void play(final String fileName) {
        System.out.println("Playing " + fileName);
    }

    public static void main(String[] args) {
        Playable playable = new DefaultPlayable();
        playable.play("abc");
    }
}
