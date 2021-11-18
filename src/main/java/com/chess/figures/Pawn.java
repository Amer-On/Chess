package com.chess.figures;

public class Pawn implements Figure {

    private final FigureType figureType = FigureType.PAWN;
    private final String figureName = "p";

    public Pawn() {

    }

    public void move() {

    }

    @Override
    public String getFigureName() { return this.figureName; }
}
