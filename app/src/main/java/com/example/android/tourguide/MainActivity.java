package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView mumbai = (ImageView) findViewById(R.id.mumbai);
        mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mumbaiIntent = new Intent(MainActivity.this,MumbaiActivity.class);
                startActivity(mumbaiIntent);
            }
        });
        ImageView goa = (ImageView) findViewById(R.id.goa);
        goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goaIntent = new Intent(MainActivity.this,GoaActivity.class);
                startActivity(goaIntent);
            }
        });
        ImageView delhi = (ImageView) findViewById(R.id.delhi);
        delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent delhiIntent = new Intent(MainActivity.this,DelhiActivity.class);
                startActivity(delhiIntent);
            }
        });
        ImageView kolkata = (ImageView) findViewById(R.id.kolkata);
        kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kolkataIntent = new Intent(MainActivity.this,KolkataActivity.class);
                startActivity(kolkataIntent);
            }
        });
    }
}
