package com.trainerfrq.oop.chess;

public class Pawn extends ChessPiece {
    protected Pawn(final Position position) {
        super(position);
    }

    @Override
    boolean isValid(final Position position) {
        return false;
    }

    // ERROR: cannot override a final method
//    final Position getPosition() {
//        return null;
//    }
}