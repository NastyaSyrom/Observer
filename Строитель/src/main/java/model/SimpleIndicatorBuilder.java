package model;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class SimpleIndicatorBuilder implements IndicatorBuilder {
    private Indicator indicator = new Indicator();

    public SimpleIndicatorBuilder(Indicator indicator){
        this.indicator = indicator;
    }

    @Override
    public void buildLines() {
        Rect rect2 = new Rect();
        indicator.getChildren().add(rect2);
        rect2.setFill(Color.GREEN);
        rect2.setStroke(Color.BLACK);
        rect2.setX(100);
        rect2.setY(130);
        rect2.setWidth(50);
        rect2.setHeight(100);
        indicator.update(rect2);
    }

    @Override
    public void buildRect() {
        Rect rect = new Rect();
        indicator.getChildren().add(rect);
        rect.setStroke(Color.BLACK);
        rect.setX(100);
        rect.setY(130);


    }


    @Override
    public Indicator getIndicator() {

        return indicator;
    }
}
