package com.github.hanyaeger.tutorial.entities.bubble;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import javafx.scene.paint.Color;

public class PoisonBubble extends Bubble implements Collider {
    public PoisonBubble(Coordinate2D location, int speed) {
        super(location, speed, Color.PURPLE);
    }
}
