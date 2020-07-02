package com.advicy.lactapp.views.fragment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.advicy.lactapp.R;

import androidx.core.content.ContextCompat;

public class CanvasView extends View {

    private Context con;
    private int red;
    private int orange;
    private int green;
    Canvas canvas;
    private int current;

    public CanvasView(Context context) {
        super(context);
        con = context;

        red = ContextCompat.getColor(con, R.color.colorRunRed);
        orange = ContextCompat.getColor(con, R.color.colorRunOrange);
        green = ContextCompat.getColor(con, R.color.colorRunGreen);

        canvas = new Canvas();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(current);
    }

    public void setRunningMode(String color) {
        switch (color) {
            case "RED":
                current = red;
                break;
            case "ORANGE":
                current = orange;
                break;
            case "GREEN":
                current = green;
                break;
        }
        invalidate();
    }
}
