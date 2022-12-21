package model;


import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Indicator extends Pane {
    ScaleTransition scaleTransition = new ScaleTransition();
    public void setRect2(Rect rect2) {

        getChildren().add(rect2);
    }

    public void setRect(Rect rect) {

        getChildren().add(rect);
    }
    public void update(Rect rect2) {

        Duration duration = Duration.millis(2500);
        //Create new translate transition
        TranslateTransition transition = new TranslateTransition(duration);
        //Move in X axis by +200
        transition.setNode(rect2);
        transition.setByX(150);
        //Move in Y axis by +100
        transition.setByY(0);
        //Go back to previous position after 2.5 seconds
        transition.setAutoReverse(false);
        //Repeat animation twice
        transition.setCycleCount(1);
        transition.play();




          /*  scaleTransition.setDuration(Duration.millis(1000));
            scaleTransition.setNode(rect2);
            //scaleTransition.setByY(1.5);
            scaleTransition.setByX(3.5);
            scaleTransition.setCycleCount(5);
            scaleTransition.setAutoReverse(false);
            scaleTransition.play();
            scaleTransition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                getChildren().remove(rect2);
            }
        });*/


        }
}
