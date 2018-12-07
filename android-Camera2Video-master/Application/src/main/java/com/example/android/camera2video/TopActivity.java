package com.example.android.camera2video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TopActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        findViewById(R.id.START).setOnClickListener(this);
    }

    public void onClick(View view){
        Intent intent = new Intent(this, Manual.class);  //インテントの作成
        startActivity(intent);                                           //画面遷移

    }
}
