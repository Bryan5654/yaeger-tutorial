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

public class Quit extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    TheLastOfBryan waterworld;

    public Quit(Coordinate2D initialLocation, TheLastOfBryan waterworld) {
        super(initialLocation, "Quit");

        this.waterworld = waterworld;
        setAnchorPoint(AnchorPoint.BOTTOM_RIGHT);
        setFill(Color.RED);
        setFont(Font.font("Roboto", FontWeight.BOLD, 20));
        setStrokeWidth(0.5);
        setStrokeColor(Color.BLACK);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        waterworld.quit();
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
