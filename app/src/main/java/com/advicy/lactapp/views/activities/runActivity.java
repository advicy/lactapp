package com.advicy.lactapp.views.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.advicy.lactapp.R;
import com.advicy.lactapp.views.fragment.CanvasView;


public class runActivity extends AppCompatActivity {

    private CanvasView canvasView;
    public Handler timerHandler = new Handler();
    private TextView timerValue;
    private TextView tempoAdvice;
    private long startTime = 0L;
    long timeInMilliseconds = 0L;
    long timeSwapBuff = 0L;
    long updatedTime = 0L;
    int secs;
    private Runnable timerRunnable = new Runnable() {
        @Override
        public void run() {
            timeInMilliseconds = SystemClock.uptimeMillis() - startTime;
            updatedTime = timeSwapBuff + timeInMilliseconds;
            secs = (int) (updatedTime / 1000);
            int mins = secs / 60;
            secs = secs % 60;
            timerValue.setText(String.format("%02d:%02d", mins, secs));
            timerHandler.postDelayed(this, 1000);
            checkColor();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);

        LinearLayout layout = findViewById(R.id.LinLayout);
        canvasView = new CanvasView(this);
        canvasView.setRunningMode("ORANGE");
        layout.addView(canvasView);
        this.timerValue = findViewById(R.id.timerTextView);
        this.startTime = SystemClock.uptimeMillis();
        timerHandler.postDelayed(timerRunnable, 0);
        tempoAdvice = findViewById(R.id.tempoTextView);
        tempoAdvice.setText(R.string.faster);
    }

    public void stopRun(View view) {
        Intent appIntent = new Intent(this, homeActivity.class);
        finish();
        startActivity(appIntent);
    }

    private void checkColor() {
        int firstChange = 10;
        int secondChange = 20;

        if(secs > secondChange + firstChange) {
            canvasView.setRunningMode("GREEN");
            tempoAdvice.setText(R.string.maintain);
        }
        else if(secs > secondChange) {
            canvasView.setRunningMode("RED");
            tempoAdvice.setText(R.string.slower);
        }
        else if(secs > firstChange) {
            canvasView.setRunningMode("GREEN");
            tempoAdvice.setText(R.string.maintain);
        }
    }
}