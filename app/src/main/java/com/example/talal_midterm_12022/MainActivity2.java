package com.example.talal_midterm_12022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MediaPlayer dogPlayer= MediaPlayer.create(this,R.raw.track1);
        final ImageView dogImage= (ImageView) findViewById(R.id.dogImage);
        final Button mainButton3 = (Button) findViewById(R.id.activity3);
        final Button mainButton4 = (Button) findViewById(R.id.activity4);

        mainButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        mainButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
            }
        });
        dogImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogPlayer.start();

            }
        });
    }
}