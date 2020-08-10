package com.trainerfrq.oop.chess;

public final class Bishop extends ChessPiece {
    protected Bishop(final Position position) {
        super(position);
    }

    @Override
    boolean isValid(final Position position) {
        return true;
    }
}

