package com.chess.piece;

import java.util.List;

import com.chess.board.Board;
import com.chess.common.Location;

public class Pawn extends Piece implements Move{
    boolean isFirstMove;
    
    public Pawn(boolean isWhite, Location location) {
        super(isWhite, location);
        this.pieceType = PieceType.PAWN;
        this.isFirstMove = true;
    }

    public boolean getIsFirstMove() {
        return isFirstMove;
    }

    @Override
    public List<Location> getValidMoves(final Board board, final Location location, final boolean isWhite) {
        //Calculate straight movement (1 or 2 squares)
        //Calculate capture
        //Caluclate en passant
        return null;
    }

    @Override
    public void movePiece(Board board, final Location from, final Location to) {
        //Move piece functions different for going straight, cannot capture pieces straight in front.
    }
}
