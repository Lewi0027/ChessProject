package com.chess.piece;

import com.chess.common.Location;

public abstract class Piece {
    public final boolean isWhite;
    public Location location;
    public PieceType pieceType; 

    // Don't need???
    //Pretty sure only using in test cases
    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public Piece(boolean isWhite, Location location) {
        this.isWhite = isWhite;
        this.location = location;
    }

    public boolean isPieceWhite() {
        return isWhite;
    }

    public Location getLocation() {
        return location;
    }

    //Do we need?
    public void setLocation(Location location) {
        this.location = location;
    }

    // Outputs Piece info, only outputs location if it is populated.
    // Outputs if first move for rooks and pawns
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Piece: Type= " + pieceType);

        if (pieceType == PieceType.ROOK || pieceType == PieceType.PAWN) {
            if (this instanceof Rook) {
                str.append(", IsFirstMove?= ").append(String.valueOf(((Rook) this).getIsFirstMove()));
            }
            else {
                str.append(", IsFirstMove?= ").append(String.valueOf(((Pawn) this).getIsFirstMove()));
            }
        }

        str.append(", Color= " + (isWhite ? "White" : "Black"));

        if (location != null) {
            str.append(", Location= " + location.toString());
        }
        
        return str.toString();
    }
}
