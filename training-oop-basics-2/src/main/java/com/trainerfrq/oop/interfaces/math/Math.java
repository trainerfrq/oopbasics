package com.trainerfrq.oop.interfaces.math;

public class Math {
    public static void main(String[] args) {
        System.out.println(execute(Operation.ADD, 2, 3));
//        System.out.println(execute(Operation.MUL, 2, 3));
//        System.out.println(execute(Operation.DIV, 2, 3));
        System.out.println(execute(Operation.SUB, 2, 3));
    }

    private static double execute(Operation operation, double op1, double op2) {
        switch (operation) {
            case ADD:
                return op1 + op2;
            case SUB:
                return op1 - op2;
//            case Operation.MUL:
//                return op1 * op2;
//            case Operation.DIV:
//                return op1 / op2;
            case MUL:
                break;
        }

        return Double.NaN;
    }
}
