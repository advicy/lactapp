package com.advicy.lactapp.views.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.advicy.lactapp.R;

public class launchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        Intent appIntent = new Intent(this, homeActivity.class);
        finish();
        startActivity(appIntent);

    }
}