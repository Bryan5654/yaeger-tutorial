package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.TheLastOfBryan;
import com.github.hanyaeger.tutorial.entities.buttons.PlayAgain;
import com.github.hanyaeger.tutorial.entities.buttons.Quit;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GameOver extends StaticScene {
    private TheLastOfBryan thelastofbryan;

    public GameOver(TheLastOfBryan thelastofbryan) {
        this.thelastofbryan = thelastofbryan;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/TheLastOfBryan2.mp3");
        setBackgroundImage("backgrounds/background1.jpg");
    }

    @Override
    public void setupEntities() {
        var gameOverText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2),
                "Game over"
        );
        gameOverText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        gameOverText.setFill(Color.RED);
        gameOverText.setFont(Font.font("Press Gothic by Canada Type.", FontWeight.SEMI_BOLD, 70));
        gameOverText.setStrokeColor(Color.BLACK);
        gameOverText.setStrokeWidth(0.5);
        addEntity(gameOverText);
        addEntity(new PlayAgain(new Coordinate2D(getWidth() / 2, getHeight() / 2 + 100), thelastofbryan));
        addEntity(new Quit(new Coordinate2D(getWidth() - 20, getHeight()), thelastofbryan));
    }
}
