package com.example.fadlianugrahemas.tpcc3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intentHome = new Intent(SplashActivity.this, HomeActivity.class);
                SplashActivity.this.startActivity(intentHome);
                SplashActivity.this.finish();
            }
        }, 4000);
    }
}
