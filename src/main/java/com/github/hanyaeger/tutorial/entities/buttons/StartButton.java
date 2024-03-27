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

public class StartButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    private TheLastOfBryan thelastofbryan;

    public StartButton(Coordinate2D initialLocation, TheLastOfBryan thelastofbryan) {
        super(initialLocation, "Play game");
        this.thelastofbryan = thelastofbryan;
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setFill(Color.BLACK);
        setFont(Font.font("Press Gothic by Canada Type.", FontWeight.BOLD, 30));
        setStrokeWidth(0.5);
        setStrokeColor(Color.WHITE);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        thelastofbryan.setActiveScene(1);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.WHITE);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.BLACK);
        setCursor(Cursor.DEFAULT);
    }
}
