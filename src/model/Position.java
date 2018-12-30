package model;

import model.common.Enums.TILE;

public class Position {

    private int x;
    private int y;
    private TILE tileType;

    Position(int x, int y, TILE tileType) {
        this.x = x;
        this.y = y;
        this.tileType = tileType;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public TILE getTileType() {
        return tileType;
    }

    public void setTileType(TILE tileType) {
        this.tileType = tileType;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", tileType=" + tileType +
                '}';
    }
}

