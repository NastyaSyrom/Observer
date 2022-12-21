package model;

import javafx.scene.layout.Pane;

public interface IndicatorBuilder {
    void buildLines();
    void buildRect();
    Indicator getIndicator();
}
