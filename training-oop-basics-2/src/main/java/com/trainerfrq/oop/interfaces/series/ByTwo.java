package com.trainerfrq.oop.interfaces.series;

public class ByTwo implements Series {
    private int value = 0;

    public int next() {
        value += 2;
        return value;
    }
}
