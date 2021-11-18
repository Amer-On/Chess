package com.chess.figures;

public class Bishop implements Figure {

    private final FigureType figureType = FigureType.BISHOP;
    private final String figureName = "b";

    public Bishop() {

    }

    public void move() {}

    @Override
    public String getFigureName() { return this.figureName; }

}
