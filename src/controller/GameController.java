package controller;

import model.GameMap;
import views.GameView;

public class GameController {

    public GameController() {
        setup();
    }

    private void setup() {
        GameMap gameMap = new GameMap();
        GameView gameView = new GameView();

        try {
            gameView.printOnTerminal(gameMap.translatePositionToChar());

            gameMap.setFood();

            gameView.printOnTerminal(gameMap.translatePositionToChar());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
