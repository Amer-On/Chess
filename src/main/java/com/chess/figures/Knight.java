package com.chess.figures;

public class Knight implements Figure {

    private final FigureType figureType = FigureType.KNIGHT;
    private final String figureName = "k";

    public Knight() {

    }

    public void move() {

    }

    @Override
    public String getFigureName() {return this.figureName;}

}
