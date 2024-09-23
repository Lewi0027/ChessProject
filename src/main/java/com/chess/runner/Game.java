package com.chess.runner;

import java.util.List;

import com.chess.board.Board;
import com.chess.common.File;
import com.chess.common.Location;
import com.chess.piece.Bishop;
import com.chess.piece.King;
import com.chess.piece.Knight;
import com.chess.piece.Move;
import com.chess.piece.Pawn;
import com.chess.piece.Piece;
import com.chess.piece.Queen;
import com.chess.piece.Rook;
import com.chess.piece.TestPiece;

public class Game {
    public static void main(String[] args) {
        //BEGIN TESTING
        System.out.println("Opening main:");
        System.out.println("Hello world!");
        System.out.println();

        //Test File Enum values
        System.out.println("Checking File values:");
        for (File file : File.values()) {
            System.out.println(file);
        }
        System.out.println();

        //Test Location Class
        System.out.println("Testing Location Class:");
        Location testLocation = new Location(File.C, 3);
        System.out.println(testLocation.toString());

        //CONSTANTS DO NOT COMMENT OUT
        final Location testLocationOne = new Location(File.A, 0);
        final Location testLocationTwo = new Location(File.H, 7);

        //Test Piece Abstract Class
        System.out.println("Testing Abstract Piece Class:");
        Piece testWhitePiece = new TestPiece(true);
        Piece testBlackPiece = new TestPiece(false);
        System.out.println(testWhitePiece);
        System.out.println(testBlackPiece);
        Piece testPiece = new TestPiece(true, testLocationOne);
        System.out.println(testPiece);

        //Test Pawn Class
        System.out.println("Testing Pawn Class");
        Piece testPawn = new Pawn(false, testLocationOne);
        System.out.println(testPawn.toString());

        //Test Other Piece Classes
        System.out.println("Testing Other Piece Class");
        Piece testBishop = new Bishop(false, testLocationOne);
        Piece testKing = new King(true, testLocationTwo);
        Piece testKnight = new Knight(false, testLocationOne);
        Piece testQueen = new Queen(true, testLocationTwo);
        Piece testRook = new Rook(false, testLocationOne);
        System.out.println(testBishop.toString());
        System.out.println(testKing.toString());
        System.out.println(testKnight.toString());
        System.out.println(testQueen.toString());
        System.out.println(testRook.toString());

        //Create Board Object, test size
        System.out.println("Testing Board Object Size");
        Board testBoardOne = new Board();
        int testBoardSize = testBoardOne.getBoardLength();
        System.out.println("Board size: " + testBoardSize);

        //Test Board Contents
        System.out.println("Testing Board Object Contents");
        Board testBoardTwo = new Board();
        testBoardTwo.printBoard();

        //Check Default rook move options no extra logic
        System.out.println("Testing Rook Move Options");
        Board testBoardThree = new Board();
        Piece piece = testBoardThree.getPieceAt(0, 0);
        if (piece != null) {
            List<Location> validMoves = ((Move) piece).getValidMoves(testLocationOne);
            piece.outputLocationList(validMoves);
        }
    }
}
