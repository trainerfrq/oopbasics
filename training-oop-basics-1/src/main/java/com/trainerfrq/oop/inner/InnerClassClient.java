package com.trainerfrq.oop.inner;

public class InnerClassClient {
    public static void main(String[] args) {
        new InnerClass.StaticInnerClass();

        InnerClass innerClass = new InnerClass();
        InnerClass.NonStaticInnerClass nonStaticInnerClass = innerClass.new NonStaticInnerClass();
        nonStaticInnerClass.setX(100);
        System.out.println(innerClass.getX());
    }
}
