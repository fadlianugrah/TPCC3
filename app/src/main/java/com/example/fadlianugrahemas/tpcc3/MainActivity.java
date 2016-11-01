package com.example.fadlianugrahemas.tpcc3;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton btntk;
    LinearLayout back;
    ImageView funlogo;
    TextView as;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntk = (ImageButton) findViewById(R.id.btnTekan);
        btntk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk = new Intent(MainActivity.this, SplashActivity.class);
                startActivity(masuk);
            }
        });



//        funlogo = (ImageView) findViewById(R.id.ic_telu);
//        as = (TextView) findViewById(R.id.asu);
//        back = (LinearLayout) findViewById(R.id.funactivity);
//        btntk = (ImageButton) findViewById(R.id.btnTekan);
//        btntk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                back.setBackgroundColor(Color.BLUE);
////                funlogo.setImageResource(R.mipmap.ic_tel);
////                as.setText("Kunam");
//                int[] ubah = {R.mipmap.ic_launcher, R.mipmap.ic_tel};
//                int [] ubahbg = {Color.BLUE,Color.BLACK,Color.RED,Color.YELLOW};
//                Random rdm = new Random();
//                int ran = rdm.nextInt(4);
//                Toast.makeText(MainActivity.this, "random number"+ran,Toast.LENGTH_SHORT).show();
////                funlogo.setImageResource(ubah[ran]);
//                back.setBackgroundColor(ubahbg[ran]);
//            }
//        });

    }
}
