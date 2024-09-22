package com.chess.piece;

import com.chess.common.Location;

public class Pawn extends Piece{
    boolean isFirstMove;
    
    public Pawn(boolean isWhite, Location location) {
        super(isWhite, location);
        this.pieceType = PieceType.PAWN;
        this.isFirstMove = true;
    }

    public boolean getIsFirstMove() {
        return isFirstMove;
    }
}
