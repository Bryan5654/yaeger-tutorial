package com.github.hanyaeger.tutorial.entities.bubble;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import com.github.hanyaeger.api.media.SoundClip;
import com.github.hanyaeger.api.scenes.SceneBorder;
import javafx.scene.paint.Color;

import java.util.List;

public abstract class Bubble extends DynamicCircleEntity implements Collided, SceneBorderCrossingWatcher {
    public Bubble(Coordinate2D location, int speed, Color color) {
        super(location);
        setMotion(speed, 180d);
        setRadius(6);
        setFill(color);
    }

    @Override
    public void onCollision(List<Collider> list) {
        var popSound = new SoundClip("audio/pop.mp3");
        popSound.play();

        remove();
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {
        remove();
    }
}
