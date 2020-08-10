package com.trainerfrq.oop.chess;

public abstract class ChessPiece {
    private Position position;

    protected ChessPiece(final Position position) {
        this.position = position;
    }

    abstract boolean isValid(final Position position);

    public final void move(final Position newPosition) {
        if (isValid(newPosition)) {
            position = newPosition;
        }
    }

    public final Position getPosition() {
        return position;
    }
}
