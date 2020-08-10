package com.trainerfrq.oop.chess;

import java.util.StringJoiner;

public class Position {
    private int x;
    private int y;

    public Position(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Position.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .add("y=" + y)
                .toString();
    }
}
