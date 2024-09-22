package com.chess.piece;

import com.chess.common.Location;

public class TestPiece extends Piece{
    public TestPiece(boolean isWhite) {
        super(isWhite);
        this.pieceType = PieceType.TEST_PIECE;
    }
}
