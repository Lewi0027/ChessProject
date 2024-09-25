package com.chess.board;

import com.chess.common.File;
import com.chess.common.Location;
import com.chess.piece.Bishop;
import com.chess.piece.King;
import com.chess.piece.Knight;
import com.chess.piece.Pawn;
import com.chess.piece.Piece;
import com.chess.piece.Queen;
import com.chess.piece.Rook;

public class Board {
    public static final int BOARD_SIZE = 8;

    Piece[][] board = new Piece[BOARD_SIZE][BOARD_SIZE];

    public Board() {
        initializeBoard();
    }

    private void initializeBoard() {
        Location locationWhiteOne;
        Location locationWhiteTwo;
        Location locationBlackOne;
        Location locationBlackTwo;
        // Create pawns
        for (int col = 0; col < BOARD_SIZE; col++) {
            File file = File.values()[col];

            locationWhiteOne = new Location(file, 1);
            board[col][1] = new Pawn(true, locationWhiteOne);

            locationBlackOne = new Location(file, 6);
            board[col][6] = new Pawn(false, locationBlackOne);
        }
        // Create rooks
        locationWhiteOne = new Location(File.A, 0);
        locationWhiteTwo = new Location(File.H, 0);
        locationBlackOne = new Location(File.A, 7);
        locationBlackTwo = new Location(File.H, 7);
        board[0][0] = new Rook(true, locationWhiteOne);
        board[7][0] = new Rook(true, locationWhiteTwo);
        board[0][7] = new Rook(false, locationBlackOne);
        board[7][7] = new Rook(false, locationBlackTwo);
        // Create knights
        locationWhiteOne = new Location(File.B, 0);
        locationWhiteTwo = new Location(File.G, 0);
        locationBlackOne = new Location(File.B, 7);
        locationBlackTwo = new Location(File.G, 7);
        board[1][0] = new Knight(true, locationWhiteOne);
        board[6][0] = new Knight(true, locationWhiteTwo);
        board[1][7] = new Knight(false, locationBlackOne);
        board[6][7] = new Knight(false, locationBlackTwo);
        // Create bishops
        locationWhiteOne = new Location(File.C, 0);
        locationWhiteTwo = new Location(File.F, 0);
        locationBlackOne = new Location(File.C, 7);
        locationBlackTwo = new Location(File.F, 7);
        board[2][0] = new Bishop(true, locationWhiteOne);
        board[5][0] = new Bishop(true, locationWhiteTwo);
        board[2][7] = new Bishop(false, locationBlackOne);
        board[5][7] = new Bishop(false, locationBlackTwo);
        // Create queens & kings
        locationWhiteOne = new Location(File.D, 0);
        locationWhiteTwo = new Location(File.E, 0);
        locationBlackOne = new Location(File.D, 7);
        locationBlackTwo = new Location(File.E, 7);
        board[3][0] = new Queen(true, locationWhiteOne);
        board[4][0] = new King(true, locationWhiteTwo);
        board[3][7] = new Queen(false, locationBlackOne);
        board[4][7] = new King(false, locationBlackTwo);
    }

    public int getBoardLength() {
        return board.length;
    }

    public Piece getPieceAt(int col, int row) {
        return board[col][row];
    }

    public Piece getPieceAt(Location location) {
        return board[location.column.ordinal()][location.row];
    }

    public void removePieceAt(int col, int row) {
        board[col][row] = null;
    }

    public void removePieceAt(Location location) {
        board[location.column.ordinal()][location.row] = null;
    }

    public void placePieceAt(Location location, Piece piece) {
        System.out.println(piece.toString());
        System.out.println(location.toString());
        removePieceAt(location);
        board[location.column.ordinal()][location.row] = piece;
    }

    // public void movePieceTo(Piece piece, Location to, Location from) {
    //     board[to.column.ordinal()][to.row]
    // } 

    public void printBoard() {
        System.out.print("\t");
        for (int col = 0; col < BOARD_SIZE; col++) {
            System.out.print(File.values()[col] + "\t");
        }
        System.out.println();

        for (int row = BOARD_SIZE - 1; row >= 0; row--) {
            System.out.print((row + 1) + "\t");
            for (int col = 0; col < BOARD_SIZE; col++) {
                Piece piece = board[col][row];
                if (piece != null) {
                    if (piece.isWhite) {
                        System.out.print(piece.pieceType + "\t");
                    } else {
                        String output = piece.pieceType.name().toLowerCase();
                        System.out.print(output + "\t");
                    }
                } else {
                    System.out.print("E\t");
                }
            }
            System.out.println();
        }
    }
}
