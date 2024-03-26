package com.github.hanyaeger.tutorial.entities.sharky;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.entities.swordfish.SwordFishSprite;

import java.util.Random;

public class Sharky extends DynamicCompositeEntity implements SceneBorderCrossingWatcher {
    public Sharky(Coordinate2D initialLocation) {
        super(initialLocation);
        setMotion(2, 90d);
    }

    @Override
    protected void setupEntities() {
        addEntity(new SharkySprite(new Coordinate2D(0, 0)));
        addEntity(new HitBox(new Coordinate2D(200, 175)));
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {
        setAnchorLocationX(0);
        setAnchorLocationY(new Random().nextInt((int) getSceneHeight() - 81));
    }
}
