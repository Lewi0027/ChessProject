package com.chess.piece;

import com.chess.common.Location;

public class Rook extends Piece{
    boolean isFirstMove;
    
    public Rook(boolean isWhite, Location location) {
        super(isWhite, location);
        this.pieceType = PieceType.ROOK;
        this.isFirstMove = true;
    }

    public boolean getIsFirstMove() {
        return isFirstMove;
    }
}
