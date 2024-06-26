package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.scenes.GameLevel;
import com.github.hanyaeger.tutorial.scenes.GameOver;
import com.github.hanyaeger.tutorial.scenes.TitleScene;

public class TheLastOfBryan extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("The Last Of Bryan");
        setSize(new Size(800, 450));
    }

    @Override
    public void setupScenes() {
        addScene(0, new TitleScene(this));
        addScene(1, new GameLevel(this));
        addScene(2, new GameOver(this));
    }
}
