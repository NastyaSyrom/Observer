package model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rect extends Rectangle {
    public Rect() {
        super(200, 100, Color.WHITE);
    }

    public void Backdrop(Pane pane) {
       /* super.setStroke(Color.BLACK);
        super.setLayoutX(100);
        super.setLayoutY(pane.getHeight() / 2 - 20);*/
    }
}


