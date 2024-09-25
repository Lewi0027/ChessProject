package com.chess.piece;

import java.util.List;
import java.util.ArrayList;

import com.chess.board.Board;
import com.chess.common.File;
import com.chess.common.Location;

public class Bishop extends Piece implements Move{
    public Bishop(boolean isWhite, Location location) {
        super(isWhite, location);
        this.pieceType = PieceType.BISHOP;
    }

    public List<Location> getValidMoves(final Board board, final Location location, final boolean isWhite) {
        // // Will hold/return all possible squares
        // List<Location> possibleSquares = new ArrayList<>();
        // final int BOARD_SIZE = 8;

        // //Get location column and row values for later use
        // int locationRow = location.getRow();
        // File file = location.getColumn(); // turn enum into int
        // int locationColumn = file.ordinal();

        // int locationRowModified = locationRow;

        // //Calculate down and left
        // for (int i = locationColumn - 1; i >= 0; i--) {
        //     while (locationRowModified >= 0) {
        //         locationRowModified--;
        //         Piece piece = board.getPieceAt(locationColumn, locationRowModified);
        //         if (piece == null) { // if there is no piece at this location
        //             Location newSquare = new Location(x, locationRowModified);
        //             possibleSquares.add(newSquare); // add location to possibleSquares
        //         } else { // if there is a peice at this location
        //             if (isWhite != piece.isWhite) { // the piece is not the same color
        //                 Location newSquare = new Location();
        //                 possibleSquares.add(newSquare); // add location to possibleSquares
        //             }
        //             break; // break loop since you ran into a piece
        //         }
        //     }
        // }
        // //Calculate up and right
        // //Calculate down and right
        // //Calculate up and left



        // return possibleSquares;
        return null;
    }

    public void movePiece(Board board, final Location from, final Location to){

    }
}
