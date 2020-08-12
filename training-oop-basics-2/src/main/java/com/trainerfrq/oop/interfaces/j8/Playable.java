package com.trainerfrq.oop.interfaces.j8;

/**
 * default and static methods are available starting with Java 8
 */
public interface Playable {

    default void play(String fileName) {
        doPlay(fileName);
    }

    static void doPlay(String fileName) {
        System.out.println("Playing " + fileName);
    }
}
