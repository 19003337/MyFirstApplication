package com.VC19003337.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_ClickMe;
    ImageView img1, img2, img3, img4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ClickMe = findViewById(R.id.btn_ClickMe);
        img1 = findViewById(R.id.img_spy1);
        img2 = findViewById(R.id.img_spy2);
        img3 = findViewById(R.id.img_spy3);
        img4 = findViewById(R.id.img_spy4);

        btn_ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText( MainActivity.this, "Boo!!!", Toast.LENGTH_SHORT).show();
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Toast.makeText( MainActivity.this, "Spy vs Spy!!!", Toast.LENGTH_SHORT).show();
                //Start the activity connect to the specified class
                Intent i = new Intent(MainActivity.this, Receiver.class);
                startActivity(i);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Toast.makeText( MainActivity.this, "What's up!!!", Toast.LENGTH_SHORT).show();
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText( MainActivity.this, "We're getting there!!!", Toast.LENGTH_SHORT).show();
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText( MainActivity.this, "This is fun. Yay!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}