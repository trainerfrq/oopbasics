package com.trainerfrq.oop.inheritance;

public class Box extends Rectangle {
    private int height;

    public Box(Rectangle rectangle, int height) {
        super(rectangle.getLength(), rectangle.getWidth());
        this.height = height;
    }

    public int area() {
        throw new RuntimeException("Box does not have an area");
    }

    public int volume() {
        return super.area() * height;
    }
}
