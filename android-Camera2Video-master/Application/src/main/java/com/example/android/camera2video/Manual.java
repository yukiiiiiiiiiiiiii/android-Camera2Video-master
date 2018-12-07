package com.example.android.camera2video;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Manual extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Manual.this, ManualScene.class);  //インテントの作成
                startActivity(intent);
            }
        });

        final VideoView videoView1 = (VideoView) findViewById(R.id.videoView1);
        videoView1.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.exploring));
        videoView1.setMediaController(new MediaController(this));
    }
}
