package com.chess.game;

import com.chess.figures.*;

public class Cell {

    private final Point point;
    private Figure figure = null;

    Cell(int x, int y) { this.point = new Point(x, y); }

    Cell(int x, int y, Figure figure) {
        this.point = new Point(x, y);
        this.figure = figure;
    }

    Cell(Point point) { this.point = point; }

    Cell(Point point, Figure figure) {
        this.point = point;
        this.figure = figure;
    }

    public void clearCell() { this.figure = null; }

    public Point getPoint() { return this.point; }

    public String getFigureName() {
        if (figure != null)
            return figure.getFigureName();
        return "0";
    }
}
