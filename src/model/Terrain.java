package model;

public class Terrain {
    private final static int MAX_WIDTH = 50;
    private final static int MAX_HEIGHT = 50;
    private char [][] map;

    public Terrain(){
        generetaMap();
    }

    private void generetaMap(){
        resetMap();
    }

    private void resetMap(){
        for(int i=0; i < MAX_WIDTH; i++){
            for(int j=0; j < MAX_HEIGHT; j++){
                map[i][j] = '-';
            }
        }
    }


}
