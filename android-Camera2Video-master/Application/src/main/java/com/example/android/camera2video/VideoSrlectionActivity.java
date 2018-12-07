package com.example.android.camera2video;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoSrlectionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_srlection);

        //1つめのビデオ表示
        final VideoView videoView1 = (VideoView) findViewById(R.id.videoView1);
        videoView1.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.exploring));
        videoView1.setMediaController(new MediaController(this));


        //2つめのビデオ表示
        final VideoView videoView2 = (VideoView) findViewById(R.id.videoView2);
        videoView2.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.exploring));
        videoView2.setMediaController(new MediaController(this));


        //3つめのビデオ表示
        final VideoView videoView3 = (VideoView) findViewById(R.id.videoView3);
        videoView3.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.exploring));
        videoView3.setMediaController(new MediaController(this));

        Button button2 = (Button) findViewById(R.id.Manual);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(VideoSrlectionActivity.this, Manual5.class);  //インテントの作成
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(VideoSrlectionActivity.this, CameraActivity.class);  //インテントの作成
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(VideoSrlectionActivity.this, Manual.class);  //インテントの作成
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(VideoSrlectionActivity.this, Manual.class);  //インテントの作成
                startActivity(intent);
            }
        });

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(VideoSrlectionActivity.this, Manual.class);  //インテントの作成
                startActivity(intent);
            }
        });

    }
}
