package com.chess.board;

import com.chess.piece.Bishop;
import com.chess.piece.King;
import com.chess.piece.Knight;
import com.chess.piece.Pawn;
import com.chess.piece.Piece;
import com.chess.piece.Queen;
import com.chess.piece.Rook;
import com.chess.common.File;
import com.chess.common.Location;

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
        //Create pawns
        for (int col = 0; col < BOARD_SIZE; col++) {
            File file = File.values()[col];

            locationWhiteOne = new Location(file, 1);
            board[1][col] = new Pawn(true, locationWhiteOne);

            locationBlackOne = new Location(file, 1);
            board[6][col] = new Pawn(true, locationBlackOne);
        }
        //Create rooks
        locationWhiteOne = new Location(File.A, 0);
        locationWhiteTwo = new Location(File.H, 0);
        locationBlackOne = new Location(File.A, 7);
        locationBlackTwo = new Location(File.H, 7);
        board[0][0] = new Rook(true, locationWhiteOne);
        board[0][7] = new Rook(true, locationWhiteTwo);
        board[7][0] = new Rook(false, locationBlackOne);
        board[7][7] = new Rook(false, locationBlackTwo);
        //Create Knights
        locationWhiteOne = new Location(File.B, 0);
        locationWhiteTwo = new Location(File.G, 0);
        locationBlackOne = new Location(File.B, 7);
        locationBlackTwo = new Location(File.G, 7);
        board[0][1] = new Knight(true, locationWhiteOne);
        board[0][6] = new Knight(true, locationWhiteTwo);
        board[7][1] = new Knight(false, locationBlackOne);
        board[7][6] = new Knight(false, locationBlackTwo);
        //Create Bishops
        locationWhiteOne = new Location(File.C, 0);
        locationWhiteTwo = new Location(File.F, 0);
        locationBlackOne = new Location(File.C, 7);
        locationBlackTwo = new Location(File.F, 7);
        board[0][2] = new Bishop(true, locationWhiteOne);
        board[0][5] = new Bishop(true, locationWhiteTwo);
        board[7][2] = new Bishop(false, locationBlackOne);
        board[7][5] = new Bishop(false, locationBlackTwo);
        //Create Queens & Kings
        locationWhiteOne = new Location(File.D, 0);
        locationWhiteTwo = new Location(File.E, 0);
        locationBlackOne = new Location(File.D, 7);
        locationBlackTwo = new Location(File.E, 7);
        board[0][3] = new Queen(true, locationWhiteOne);
        board[0][4] = new King(true, locationWhiteTwo);
        board[7][3] = new Queen(false, locationBlackOne);
        board[7][4] = new King(false, locationBlackTwo);
    }

    public int getBoardLength() {
        return board.length;
    }

    public void printBoard() {
        System.out.print("\t");
        for (int col = 0; col < BOARD_SIZE; col++) {
            System.out.print(File.values()[col] + "\t");
        }
        System.out.println();
    
        for (int row = BOARD_SIZE - 1; row >= 0; row--) {
            System.out.print((row + 1) + "\t");
            for (int col = 0; col < BOARD_SIZE; col++) {
                Piece piece = board[row][col];
                if (piece != null) {
                    System.out.print(piece.pieceType + "\t");
                } else {
                    System.out.print("E\t");
                }
            }
            System.out.println();
        }
    }
}
