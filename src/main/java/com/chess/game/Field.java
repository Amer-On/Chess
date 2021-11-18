package com.chess.game;

import java.io.*;
import java.util.*;

import com.chess.figures.*;

// field for two players
public class Field {

    private Cell[][] gameField;
    private final int length = 8, width = 8;
    private ArrayList<Figure> figureList = new ArrayList<Figure>();

    Field() {
        this.gameField = createField();
    }

    private Cell[][] createField() {
        Cell[][] gameField = new Cell[this.length][this.width];
        char[][] charField = readFileToCharArr();

        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                switch (charField[i][j]) {
                    case 'z':
                        gameField[i][j] = new Cell(i, j);
                        break;
                    case 'p':
                        gameField[i][j] = new Cell(i, j, new Pawn());
                        break;

                    case 'r':
                        gameField[i][j] = new Cell(i, j, new Rook());
                        break;

                    case 'k':
                        gameField[i][j] = new Cell(i, j, new Knight());
                        break;

                    case 'b':
                        gameField[i][j] = new Cell(i, j, new Bishop());
                        break;

                    case 'q':
                        gameField[i][j] = new Cell(i, j, new Queen());
                        break;

                    case 'K':
                        gameField[i][j] = new Cell(i, j, new King());
                        break;

                }
            }
        }

        return gameField;
    }

    private void printField() {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++)
                System.out.print(this.gameField[i][j].getFigureName() + " ");
            System.out.println();
        }

    }

    public void execute(){
        printField();
    };

    private char[][] readFileToCharArr() {return readFileToCharArr("classicChess.txt");}

    // need to test out
    private char[][] readFileToCharArr(final String fileName) {
        char[][] charField = new char[this.length][this.width];
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/static/" + fileName));
            String line;
            int currentId = 0;

            while ((line = br.readLine()) != null) {
                charField[currentId] = line.replaceAll(" ", "").toCharArray();
                currentId++;
            }

            br.close();
            return charField;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void printCharArray(char[][] charArray) {
        for (char[] line : charArray) {
            for (char chr : line)
                System.out.print(chr + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Field field = new  Field();
        field.execute();
    }
}
