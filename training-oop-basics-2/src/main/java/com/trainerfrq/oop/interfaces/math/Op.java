package com.trainerfrq.oop.interfaces.math;

public enum Op {
    ADD("add"),
    SUB("sub")
    ;
    private String value;

    Op(String value) {
        this.value = value;
    }
}
