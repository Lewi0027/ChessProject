package com.chess.piece;

import com.chess.common.Location;

public class Bishop extends Piece{
    public Bishop(boolean isWhite, Location location) {
        super(isWhite, location);
        this.pieceType = PieceType.BISHOP;
    }
}
