package com.trainerfrq.oop.interfaces.math;

/**
 * static fields (actual public static final) allow sharing constants between classes
 */
public enum Operation {
    ADD("add"),
    SUB("sub"),
    MUL("mul")
    ;

    private String name;
    Operation(String name) {
        this.name = name;
    }

//    String ADD = "add";
//    String SUB = "subtract";
//    String MUL = "multiply";
//    String DIV = "divide";
}
