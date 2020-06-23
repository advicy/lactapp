package com.advicy.lactapp.views.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.advicy.lactapp.R;

public class dataActivity extends AppCompatActivity {

    private String[] dataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        //catch toolbar_data
        Toolbar dataToolbar = findViewById(R.id.toolbar_data);
        dataToolbar.setTitle(R.string.title_statistics);
        setSupportActionBar(dataToolbar);
        //get corresponding Actionbar
        ActionBar ab = getSupportActionBar();
        //enable up button
        assert ab != null;
        ab.setDisplayHomeAsUpEnabled(true);

        initDataset();
    }

    private void initDataset() {
        dataset = new String[10];
        for (int i = 0; i < 10; i++) {
            dataset[i] = "This is element #" + i;
        }
    }
}