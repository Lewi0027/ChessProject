package com.chess.piece;

import com.chess.common.Location;

public class King extends Piece{
    boolean isFirstMove;

    public King(boolean isWhite, Location location) {
        super(isWhite, location);
        this.pieceType = PieceType.KING;
        this.isFirstMove = true;
    }
}