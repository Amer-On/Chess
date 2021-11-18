package com.chess.figures;

public class Queen implements Figure {

    private final FigureType figureType = FigureType.QUEEN;
    private final String figureName = "q";

    public Queen() {

    }

    public void move() {

    }

    @Override
    public String getFigureName() { return figureName; }

}
