package com.chess.piece;

import com.chess.common.Location;

public class Knight extends Piece{
    public Knight(boolean isWhite, Location location) {
        super(isWhite, location);
        this.pieceType = PieceType.KNIGHT;
    }
}
