package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Waterworld;
import com.github.hanyaeger.tutorial.entities.Hanny;
import com.github.hanyaeger.tutorial.entities.Swordfish;
import com.github.hanyaeger.tutorial.entities.text.HealthText;

public class GameLevel extends DynamicScene {
    Waterworld waterworld;

    public GameLevel(Waterworld waterworld){
        this.waterworld = waterworld;
    }
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/waterworld.mp3");
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
        addEntity(new Swordfish(new Coordinate2D((getWidth() / 3) * 2, getHeight() / 2)));
        addEntity(new Hanny(new Coordinate2D(1, 1), new HealthText(new Coordinate2D(100, 50)), waterworld));
    }
}
