package com.chess.piece;

import java.util.List;

import com.chess.board.Board;
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
    public List<Location> getValidMoves(final Board board, final Location location, final boolean isWhite) {
        // Will hold/return all possible squares
        List<Location> possibleSquares = new ArrayList<>();
        final int BOARD_SIZE = 8;

        //Get location column and row values for later use
        int locationRow = location.getRow();
        File file = location.getColumn(); // turn enum into int
        int locationColumn = file.ordinal();

        //Add all locations on the same column that the rook can access
        //Start by check items below it
        for (int i = locationRow - 1; i >= 0; i--) {
            Piece piece = board.getPieceAt(locationColumn, i); // create piece object at location denoted by iterator
            if (piece == null) { // if there is no piece at this location
                Location newSquare = new Location(location.column, i);
                possibleSquares.add(newSquare); // add location to possibleSquares
            } else { // if there is a peice at this location
                if (isWhite != piece.isWhite) { // the piece is not the same color
                    Location newSquare = new Location(location.column, i);
                    possibleSquares.add(newSquare); // add location to possibleSquares
                }
                break; // break loop since you ran into a piece
            }

        }
        //Check locations above rook
        for (int i = locationRow + 1; i < BOARD_SIZE; i++) {
            Piece piece = board.getPieceAt(locationColumn, i);
            if (piece == null) {
                Location newSquare = new Location(location.column, i);
                possibleSquares.add(newSquare);
            } else  {
                if (isWhite != piece.isWhite) {
                    Location newSquare = new Location(location.column, i);
                    possibleSquares.add(newSquare);
                }
                break;
            }
        }

        //Check locations to right and left of rook
        //Check to left of rook first
        for (int i = locationColumn - 1; i>= 0; i--) {
            Piece piece = board.getPieceAt(i, locationRow);
            char iChar = (char) ('A' + i);
            if (piece == null) {
                Location newSquare = new Location(File.valueOf(Character.toString(iChar)), locationRow);
                possibleSquares.add(newSquare);
            } else {
                if (isWhite != piece.isWhite) {
                    Location newSquare = new Location(File.valueOf(Character.toString(iChar)), locationRow);
                    possibleSquares.add(newSquare);
                }
                break;
            }
        }

        for (int i = locationColumn + 1; i < BOARD_SIZE; i++) {
            Piece piece = board.getPieceAt(i, locationRow);
            char iChar = (char) ('A' + i);
            if (piece == null) {
                Location newSquare = new Location(File.valueOf(Character.toString(iChar)), locationRow);
                possibleSquares.add(newSquare);
            } else {
                if (isWhite != piece.isWhite) {
                    Location newSquare = new Location(File.valueOf(Character.toString(iChar)), locationRow);
                    possibleSquares.add(newSquare);
                }
                break;
            }
        }

        //Need to add castling function

        return possibleSquares;
    }

    @Override
    public void movePiece(Board board, final Location from, final Location to){
        Piece piece = board.getPieceAt(from);
        // System.out.println(clonedPiece.toString());
        board.placePieceAt(to, piece);
        board.removePieceAt(from);
    }
}
