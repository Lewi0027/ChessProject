package com.chess.piece;

import java.util.List;

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

    public Piece(Piece piece) {
        this.isWhite = piece.isWhite;
        this.location = piece.location;
        this.pieceType = piece.pieceType;
    }
    
    public void outputLocationList(List<Location> locations) {
        if (locations.size() == 0) {
            System.out.println("Empty moves list");
            return;
        }
        
        for (int i = 0; i < locations.size(); i++) {
            System.out.println((i+1) + ": " + locations.get(i).toString());
        }
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
            str.append(", " + location.toString());
        }
        
        return str.toString();
    }
}
