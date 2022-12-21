package model;

import javafx.scene.layout.Pane;

public class Director {
    public Indicator build(IndicatorBuilder builder) {
        builder.buildRect();
        builder.buildLines();
        return builder.getIndicator();
    }
}
