package com.example.android.camera2video;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class ManualScene extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_scene);

        Button button = (Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ManualScene.this, Manual2.class);  //インテントの作成
                startActivity(intent);
            }
        });

        Button button1 = (Button) findViewById(R.id.button10);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ManualScene.this, CameraActivity.class);  //インテントの作成
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.button11);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ManualScene.this, CameraActivity.class);  //インテントの作成
                startActivity(intent);
            }
        });

        final VideoView videoView1 = (VideoView) findViewById(R.id.videoView1);
        videoView1.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.exploring1));
        videoView1.setMediaController(new MediaController(this));

        final VideoView videoView2 = (VideoView) findViewById(R.id.videoView2);
        videoView2.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.exploring2));
        videoView2.setMediaController(new MediaController(this));

        final VideoView videoView3 = (VideoView) findViewById(R.id.videoView3);
        videoView3.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.exploring3));
        videoView3.setMediaController(new MediaController(this));

        final VideoView videoView4 = (VideoView) findViewById(R.id.videoView4);
        videoView4.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.exploring4));
        videoView4.setMediaController(new MediaController(this));
    }
}
