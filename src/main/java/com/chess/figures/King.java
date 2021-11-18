package com.chess.figures;

public class King implements Figure {

    private final FigureType figureType = FigureType.KING;
    private final String figureName = "K";

    public King() {

    }

    public void move() {

    }

    @Override
    public String getFigureName() { return this.figureName; }

}
