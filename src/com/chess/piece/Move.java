package com.chess.piece;

import java.util.List;

import com.chess.common.Location;

public interface Move {
    public List<Location> GetValidMoves(Piece piece, Location location);
    public void movePiece(Location startLocation, Location endLocation);
}
