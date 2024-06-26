package com.github.hanyaeger.tutorial.entities.text;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HealthText extends TextEntity {
    public HealthText(Coordinate2D initialLocation){
        super(initialLocation);

        setFont(Font.font("Roboto", FontWeight.NORMAL, 30));
        setFill(Color.DARKBLUE);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setStrokeWidth(2);
        setStrokeColor(Color.BLACK);
    }

    public void setHealthText(int health){
        setText("Health: " + health);
    }
}
