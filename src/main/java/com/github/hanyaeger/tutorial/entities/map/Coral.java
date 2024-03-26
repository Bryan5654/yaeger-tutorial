package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.entities.Hanny;

import java.util.List;

public class Coral extends SpriteEntity implements Collided {

    public Coral(Coordinate2D initialLocation, Size grootte, String resource) {
        super(resource, initialLocation, grootte);
    }

    @Override
    public void onCollision(List<Collider> list) {
    }
}
