package com.example.talal_midterm_12022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        MediaPlayer playerMarimba= MediaPlayer.create(this,R.raw.track1);
        playerMarimba.start();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity5.this,MainActivity3.class);
                startActivity(intent);

            }


        };
        Timer openning = new Timer();
        openning.schedule(task,10000);
    }
}