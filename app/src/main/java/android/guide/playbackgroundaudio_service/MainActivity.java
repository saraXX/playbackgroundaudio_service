package android.guide.playbackgroundaudio_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button start,stop,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.startBtnV);
        stop = findViewById(R.id.stopBtnV);
        next = findViewById(R.id.nextBtnV);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//  TODO 3 start service
                startService(new Intent(MainActivity.this, MyAudioService.class));
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//  TODO 4 stop service

                stopService(new Intent(MainActivity.this, MyAudioService.class));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                startActivity(i);

            }
        });
    }
}