package com.chess.piece;

import com.chess.common.Location;

public abstract class Piece {
    public final boolean isWhite;
    public Location location;
    public PieceType pieceType; 

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isPieceWhite() {
        return isWhite;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    // Outputs Piece info, only outputs location if it is populated.
    @Override
    public String toString() {
        return "Piece: Type= " + pieceType +
            ", Color= " + (isWhite ? "White" : "Black") +
            (location != null ? ", Location= " + location.toString() : "");
    }
}
