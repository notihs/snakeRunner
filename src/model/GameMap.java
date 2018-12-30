package model;

import model.common.Enums.TILE;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import static model.common.Constants.MAXIMUM_X;
import static model.common.Constants.MAXIMUM_Y;

public class GameMap {
    ArrayList<Position> mapPositions = new ArrayList<>();

    public GameMap() {
        generetaMap();
    }

    private void generetaMap() {
        resetMap();
        //position entities
        //position food/etc
    }

    //Builds only floor and the walls
    private void resetMap() {
        for (int i = 0; i < MAXIMUM_Y; i++) {
            for (int j = 0; j < MAXIMUM_X; j++) {
                Position currentPosition = new Position(j, i, TILE.FLOOR);

                if (isBorder(currentPosition)) {
                    currentPosition.setTileType(TILE.WALL);
                }

                mapPositions.add(currentPosition);
            }
        }
    }

    private boolean isBorder(Position position) {
        return isBorder(position.getX(), position.getY());
    }

    private boolean isBorder(int x, int y) {
        return x == 0 ||
                y == 0 ||
                x == MAXIMUM_X - 1 ||
                y == MAXIMUM_Y - 1;
    }

    public void setFood() {
        int randomTile;
        int x;
        int y;

        do {
            randomTile = ThreadLocalRandom.current().nextInt(0, MAXIMUM_X * MAXIMUM_Y - 1); //This can become more efficient if needed
            y = randomTile / MAXIMUM_X;
            x = randomTile % MAXIMUM_X;
            System.out.println("Random Tile chosen: " + randomTile + new Position(x, y, TILE.FOOD));
        }
        while (isBorder(x, y));

        mapPositions.get(randomTile).setTileType(TILE.FOOD);
    }

    public char[] translatePositionToChar() throws Exception {
        StringBuilder mapOnString = new StringBuilder();
        char tileChar;

        for (Position position : mapPositions) {
            switch (position.getTileType()) {
                case WALL:
                    tileChar = 'o';
                    break;
                case FLOOR:
                    tileChar = '+';
                    break;
                case SNAKE:
                    tileChar = 's'; //This should be changed for a player identifier
                    break;
                case FOOD:
                    tileChar = 'F';
                    break;
                default:
                    throw new Exception("Unexpected tile found: " + position.getTileType().name());
            }

            mapOnString.append(tileChar);
        }

        return mapOnString.toString().toCharArray();
    }
}