package data;

public class Entity {
    private int id;
    private Position position;

    public Entity(int id, int startX, int startY)
    {
        this.id = id;
        this.position = new Position(startX, startY);
    }

    private class Position{
        int x;
        int y;

        Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}



