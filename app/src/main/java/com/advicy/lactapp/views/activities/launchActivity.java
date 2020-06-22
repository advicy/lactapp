package com.advicy.lactapp.views.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.advicy.lactapp.BuildConfig;
import com.advicy.lactapp.R;

public class launchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        //Intent appIntent = new Intent(this, homeActivity.class);
        //finish();
        //startActivity(appIntent);

        if(checkFirstRun()){
            Intent appIntent = new Intent(this, homeActivity.class);
            finish();
            startActivity(appIntent);
        }
        else {
            Intent appIntent = new Intent(this, homeActivity.class);
            finish();
            startActivity(appIntent);
        }

    }

    private boolean checkFirstRun() {

        final String PREFS_NAME = "LaunchPreferences";
        final String PREF_VERSION_CODE_KEY = "app_version_code";
        final int DOES_NOT_EXIST = -1;

        //get current Version
        int currentVersion = BuildConfig.VERSION_CODE;

        //get saved version code
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        int savedVersionCode = prefs.getInt(PREF_VERSION_CODE_KEY, DOES_NOT_EXIST);

        //update the shared Preferences with current Version
        prefs.edit().putInt(PREF_VERSION_CODE_KEY, currentVersion).apply();

        //check for first run
        if(currentVersion > savedVersionCode) {
            //update detected
            return false;
        }
        else if(savedVersionCode == DOES_NOT_EXIST) {
            //new install or shared prefs were deleted
            return true;
        }
        else if(currentVersion == savedVersionCode) {
            //normal run
            return false;
        }
        else {
            return false;
        }
    }
}