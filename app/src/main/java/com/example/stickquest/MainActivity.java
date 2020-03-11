package com.example.stickquest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gamePlayScreen(View V)
    {
        //loads the game play screen
        Intent intent = new Intent(this, GameScreenActivity.class);
        startActivity(intent);
    }

    public void settingScreen(View V)
    {
        //loads the setting screen (overlay
        Intent intent = new Intent (this, SettingActivity.class);
        startActivity(intent);
    }













}
