package com.github.hanyaeger.tutorial.entities.sharky;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class SharkySprite extends DynamicSpriteEntity {
    public SharkySprite(Coordinate2D location) {
        super("sprites/sharky.png", location);
        setAutoCycle(1, 0);
    }
}
