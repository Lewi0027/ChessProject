package com.chess.piece;

import java.util.List;

import com.chess.common.Location;

public interface Move {
    public List<Location> getValidMoves(final Location location);
    public void movePiece(Location from, Location to);
}
