package com.trainerfrq.oop.interfaces.play;

public class PlayableImpl extends AbstractPlayable {
    @Override
    public void play(final String fileName) {
        System.out.println("Playing " + fileName);
    }

    public static void main(String[] args) {
        AbstractPlayable playable = new PlayableImpl();
        playable.startPlay("abc");
    }
}
