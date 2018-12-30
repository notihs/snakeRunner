package views;

import controller.GameController;

import static model.common.Constants.MAXIMUM_X;
import static model.common.Constants.MAXIMUM_Y;

public class GameView {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        GameController gameController = new GameController();

        long end = System.currentTimeMillis();
        System.out.println("Time taken (in ms): " + (end - start));
    }

    public void printOnTerminal(char[] map) {
        for (int i = 0; i < MAXIMUM_Y; i++) {
            for (int j = 0; j < MAXIMUM_X; j++) {
                System.out.print(map[j + i * MAXIMUM_X]);
            }
            System.out.println();
        }
    }
}
