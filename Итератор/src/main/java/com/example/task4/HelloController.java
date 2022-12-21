package com.example.task4;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.ImageCollection;
import model.Iterator;
import javafx.event.ActionEvent;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    public TextField numSlide;
    public ImageCollection imgs = new ImageCollection();

    public Iterator iter_main = imgs.getIterator();
    public Timeline timeline = new Timeline();
    @FXML
    public ImageView trash;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timeline.setCycleCount(Timeline.INDEFINITE);//кол-во повторов
        timeline.getKeyFrames().add(new KeyFrame(new Duration(1500), new EventHandler() {
            @Override
            //Обрабочик события временной шкалы
            public void handle(Event event) {
                if (iter_main.hasNext()) {
                    Image name = (Image) iter_main.next();
                    trash.setImage(name);
                    numSlide.setText(String.valueOf(iter_main.getCurrent()));
                }
            }
        }));
    }

    public void onBackButtonClick(ActionEvent actionEvent) {
        if (iter_main.hasPreview()) {
            Image name = (Image) iter_main.preview();
            trash.setImage(name);
            numSlide.setText(String.valueOf(iter_main.getCurrent()));

        }
    }

    public void onStartButtonClick(ActionEvent actionEvent) {
        timeline.play();

    }

    public void onNextButtonClick(ActionEvent actionEvent) {
        if (iter_main.hasNext()) {
            Image name = (Image) iter_main.next();
            trash.setImage(name);
            numSlide.setText(String.valueOf(iter_main.getCurrent()));
        }
    }

    public void onStopButtonClick(ActionEvent actionEvent) {
        timeline.stop();
    }



}