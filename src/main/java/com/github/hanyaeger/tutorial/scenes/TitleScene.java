package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.TheLastOfBryan;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleScene extends StaticScene {
    private TheLastOfBryan thelastofbryan;

    public TitleScene(TheLastOfBryan thelastofbryan){
        this.thelastofbryan = thelastofbryan;
    }
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/TitelschermAudio.mp3");
        setBackgroundImage("backgrounds/background1.jpg");
    }

    @Override
    public void setupEntities() {
        var thelastofbryanText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 3),
                "The Last Of Bryan"
        );
        thelastofbryanText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        thelastofbryanText.setFill(Color.WHITE);
        thelastofbryanText.setFont(Font.font("Press Gothic by Canada Type", FontWeight.EXTRA_BOLD, 70));
        thelastofbryanText.setStrokeColor(Color.BLACK);
        thelastofbryanText.setStrokeWidth(1.5);
        var makersText = new TextEntity(
                new Coordinate2D(20, getHeight() - 20),
                "Made by Sasha van Ree & Bryan Velthuizen"
        );
        makersText.setAnchorPoint(AnchorPoint.BOTTOM_LEFT);
        makersText.setFill(Color.LIGHTGRAY);
        makersText.setFont(Font.font("Press Gothic by Canada Type", FontWeight.EXTRA_BOLD, 10));
        makersText.setStrokeColor(Color.BLACK);
        makersText.setStrokeWidth(0.2);
        addEntity(thelastofbryanText);
        addEntity(makersText);
        addEntity(new StartButton(new Coordinate2D(getWidth() / 2, getHeight() / 2 + 100), thelastofbryan));
    }
}
