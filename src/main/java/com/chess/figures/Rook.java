package com.chess.figures;

public class Rook implements Figure {

    private final FigureType figureType = FigureType.ROOK;
    private final String figureName = "r";

    public Rook() {

    }

    public void move() {}

    @Override
    public String getFigureName() {return this.figureName;}

}
