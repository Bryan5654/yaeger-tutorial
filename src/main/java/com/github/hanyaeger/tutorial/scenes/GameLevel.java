package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.TheLastOfBryan;
import com.github.hanyaeger.tutorial.entities.Hanny;
import com.github.hanyaeger.tutorial.entities.map.CoralTileMap;
import com.github.hanyaeger.tutorial.entities.sharky.Sharky;
import com.github.hanyaeger.tutorial.entities.swordfish.Swordfish;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import com.github.hanyaeger.tutorial.spawners.BubbleSpawner;

public class GameLevel extends DynamicScene implements EntitySpawnerContainer, TileMapContainer {
    TheLastOfBryan waterworld;

    public GameLevel(TheLastOfBryan waterworld){
        this.waterworld = waterworld;
    }
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/TheLastOfBryan.mp3");
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
        addEntity(new Swordfish(new Coordinate2D((getWidth() / 3) * 2, getHeight() / 2)));
        addEntity(new Sharky(new Coordinate2D(0, 100)));
        addEntity(new Hanny(new Coordinate2D(1, 1), new HealthText(new Coordinate2D(100, 50)), waterworld));
    }

    @Override
    public void setupEntitySpawners() {
        addEntitySpawner(new BubbleSpawner(getWidth(), getHeight()));
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new CoralTileMap());
    }
}
