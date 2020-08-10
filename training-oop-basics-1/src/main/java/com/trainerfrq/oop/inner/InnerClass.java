package com.trainerfrq.oop.inner;

public class InnerClass {
    private int x;

    public int getX() {
        return x;
    }

    static class StaticInnerClass {

    }

    class NonStaticInnerClass {
        public void setX(int givenX) {
            x = givenX;
        }
    }
}
