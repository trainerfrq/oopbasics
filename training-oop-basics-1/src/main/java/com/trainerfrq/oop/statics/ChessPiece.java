package com.trainerfrq.oop.statics;

public class ChessPiece {
    public static int tableSize;

    public static void main(String[] args) {
        System.out.println(tableSize);

        ChessPiece.tableSize = 9;
        System.out.println(tableSize);

        new ChessPiece().tableSize = 10;
        System.out.println(tableSize);
    }
}
