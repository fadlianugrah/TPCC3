package com.example.fadlianugrahemas.tpcc3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class HomeActivity extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        web = (WebView) findViewById(R.id.webnya);
        web.loadUrl("http://google.com");
    }
}
