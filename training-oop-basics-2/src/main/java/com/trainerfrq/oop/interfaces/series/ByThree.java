package com.trainerfrq.oop.interfaces.series;

public class ByThree implements Series {
    private int value;

    public int next() {
        value += 3;
        return value;
    }
}
