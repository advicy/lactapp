package com.advicy.lactapp.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.advicy.lactapp.R;
import com.advicy.lactapp.views.fragment.CanvasView;

public class runActivity extends AppCompatActivity {

    private CanvasView canvasView;
    private TextView timerText;
    private CountDownTimer cdt;
    private long timeRunning = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);

        LinearLayout layout = findViewById(R.id.LinLayout);
        canvasView = new CanvasView(this);
        canvasView.setRunningMode("ORANGE");
        layout.addView(canvasView);

        timerText = findViewById(R.id.timerTextView);
    }
}