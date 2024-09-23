package com.chess.piece;

import java.util.List;

import com.chess.common.File;
import com.chess.common.Location;

import java.util.ArrayList;

public class Rook extends Piece implements Move{
    boolean isFirstMove;
    
    public Rook(boolean isWhite, Location location) {
        super(isWhite, location);
        this.pieceType = PieceType.ROOK;
        this.isFirstMove = true;
    }

    public boolean getIsFirstMove() {
        return isFirstMove;
    }

    @Override
    //Calculate all horizontal vertical squares, then will improve
    public List<Location> getValidMoves(final Location location) {
        // Will hold/return all possible squares
        List<Location> possibleSquares = new ArrayList<>();
        final int BOARD_SIZE = 8;

        //Add all squares on same column
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (i != location.row) {
                Location newSquare = new Location(location.column, i);
                possibleSquares.add(newSquare);
                // System.out.println(newSquare.toString());
            }
        }

        //Add all squares on same row
        for (int i = 0; i < BOARD_SIZE; i++) {
            char colChar = (char) ('A' + i); // turn iterator into A,B,C,D,et. for column values
            if (File.valueOf(Character.toString(colChar)) != location.column) {
                Location newSquare = new Location(File.valueOf(Character.toString(colChar)), location.row);
                possibleSquares.add(newSquare);
            }
        }

        //Need to thin possible squares now based on pieces present.
        //Need to add castling function

        return possibleSquares;
    }

    @Override
    public void movePiece(Location from, Location to){
        //Needs to implement moving piece as well as capturing piece
    }
}
