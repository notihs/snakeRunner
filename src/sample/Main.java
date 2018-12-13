package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    private final static int WINDOW_HEIGHT = 275;
    private final static int WINDOW_WIDTH = 500;
    private final static int BORDER_OFFSET = 2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT));
        primaryStage.show();
//        root.lookup("")
    }

    public static void main(String[] args) {
        launch(args);
    }

    private Group drawBorders() {
        Rectangle r = new Rectangle(WINDOW_WIDTH, WINDOW_HEIGHT, Paint.valueOf("#00000000"));

        //Using lines
        //Creating a Path
        Path path = new Path();
        //Moving to the starting point
        MoveTo moveTo = new MoveTo(BORDER_OFFSET, BORDER_OFFSET);

        //Creating 1st line
        LineTo line1 = new LineTo(BORDER_OFFSET, WINDOW_HEIGHT - BORDER_OFFSET);

        //Creating 2nd line
        LineTo line2 = new LineTo(WINDOW_WIDTH - BORDER_OFFSET, WINDOW_HEIGHT - BORDER_OFFSET);

        //Creating 3rd line
        LineTo line3 = new LineTo(WINDOW_WIDTH - BORDER_OFFSET, BORDER_OFFSET);

        //Creating 4th line
        LineTo line4 = new LineTo(BORDER_OFFSET, BORDER_OFFSET);

        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4);

        return new Group(path);
    }

    private void prepareScene(Stage primaryStage) {
//        primaryStage.
    }
}
