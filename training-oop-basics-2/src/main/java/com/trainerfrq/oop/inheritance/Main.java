package com.trainerfrq.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Box box = new Box(rectangle, 30);
        Rectangle r = new Box(rectangle, 30);


//        System.out.println(rectangle.area());
//        System.out.println(box.volume());
//        System.out.println(box.area());
        System.out.println(((Box) r).volume());
        System.out.println(((Box)rectangle).volume());
    }
}
