package com.chess.figures;

public interface Figure {
    FigureType figureType = FigureType.NOTYPE;
    String figureName = "";
    int x = 0;
    int y = 0;

    void move();

    default String getFigureName() {return this.figureName;}

    default String getFigureType() {
        return this.figureType.toString();}
}
