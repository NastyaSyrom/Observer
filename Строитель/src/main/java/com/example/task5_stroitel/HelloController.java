package com.example.task5_stroitel;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import model.Director;
import model.SimpleIndicatorBuilder;
import model.Indicator;


public class HelloController {

    public Pane indPane;
    public TextField time;

    Director direct = new Director();
    Indicator indicator = new Indicator();

    public void indicator(){
        indPane.getChildren().clear();
        direct.build(new SimpleIndicatorBuilder(indicator));
        indPane.getChildren().add(indicator);
    }

    public void clear(){
        indPane.getChildren().clear();
    }
}
