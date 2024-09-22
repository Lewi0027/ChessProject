package com.chess.piece;

import com.chess.common.Location;

public class TestPiece extends Piece{
    public TestPiece(boolean isWhite) {
        super(isWhite);
        this.pieceType = PieceType.TEST_PIECE;
    }

    public TestPiece(boolean isWhite, Location location) {
        super(isWhite, location);
        this.pieceType = PieceType.TEST_PIECE;
    }
}
