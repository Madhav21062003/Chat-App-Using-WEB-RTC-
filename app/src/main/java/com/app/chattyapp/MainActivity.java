package com.app.chattyapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.zegocloud.zimkit.services.ZIMKit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initZegoCloud();

        startActivity(new Intent(this, LoginMockActivity.class));
        finish();
    }

    public void initZegoCloud(){
        ZIMKit.initWith(this.getApplication(),KeyConstants.appId, KeyConstants.appSign);

        ZIMKit.initNotifications();
    }
}