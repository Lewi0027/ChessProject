package com.chess.piece;

import java.util.List;

import com.chess.board.Board;
import com.chess.common.Location;

public interface Move {
    public List<Location> getValidMoves(final Board board, final Location location, final boolean isWhite);
    public void movePiece(Board board, final Location from, final Location to);
}
