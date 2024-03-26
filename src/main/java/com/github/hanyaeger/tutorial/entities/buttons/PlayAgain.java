package com.github.hanyaeger.tutorial.entities.buttons;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.tutorial.TheLastOfBryan;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class PlayAgain extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    TheLastOfBryan waterworld;

    public PlayAgain(Coordinate2D initialLocation, TheLastOfBryan waterworld) {
        super(initialLocation, "Play again");
        this.waterworld = waterworld;
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setFill(Color.PURPLE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        setStrokeWidth(0.5);
        setStrokeColor(Color.BLACK);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        waterworld.setActiveScene(1);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.VIOLET);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.PURPLE);
        setCursor(Cursor.DEFAULT);
    }
}
