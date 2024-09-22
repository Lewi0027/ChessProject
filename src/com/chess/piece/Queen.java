package com.chess.piece;

import com.chess.common.Location;

public class Queen extends Piece{
    public Queen(boolean isWhite, Location location) {
        super(isWhite, location);
        this.pieceType = PieceType.QUEEN;
    }
}
