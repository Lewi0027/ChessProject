package com.chess.runner;

import com.chess.common.Location;
import com.chess.common.File;
import com.chess.piece.Piece;
import com.chess.piece.TestPiece;

public class Game {
    public static void main(String[] args) {
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
        File testFileA = File.A;
        File testFileH = File.H;
        Location testLocationOne = new Location(testFileA, 0);
        Location testLocationTwo = new Location(testFileH, 7);
        System.out.println(testLocationOne.toString());
        System.out.println(testLocationTwo.toString());


        //Test Piece Abstract Class
        System.out.println("Testing Abstract Piece Class:");
        Piece testWhitePiece = new TestPiece(true);
        Piece testBlackPiece = new TestPiece(false);
        System.out.println(testWhitePiece);
        System.out.println(testBlackPiece);

    }
}
