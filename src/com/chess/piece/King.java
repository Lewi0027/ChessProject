package com.chess.piece;

import com.chess.common.Location;

public class King extends Piece{
    public King(boolean isWhite, Location location) {
        super(isWhite, location);
        this.pieceType = PieceType.KING;
    }
}