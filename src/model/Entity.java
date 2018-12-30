package model;

import model.common.Enums;

public class Entity {
    private int id;
    private Position position;
    //other stuff such as size

    public Entity(int id, int startX, int startY) {
        this.id = id;
        this.position = new Position(startX, startY, Enums.TILE.SNAKE);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}



