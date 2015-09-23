package com.example.simpalm.android_ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity



{
    Button spotify_btn, scores_app_btn, library_app_btn, build_bigger_btn, xys_btn, capstone_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spotify_btn = (Button)findViewById(R.id.btnspotify);
        spotify_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer App",
                        Toast.LENGTH_SHORT).show();
            }
        });


    scores_app_btn = (Button)findViewById(R.id.btnscores_app);
    scores_app_btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Toast.makeText(getApplicationContext(), "This button will launch my Scores App",
                Toast.LENGTH_SHORT).show();
    }
});

    library_app_btn = (Button)findViewById(R.id.btnlibrary);
    library_app_btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Toast.makeText(getApplicationContext(), "This button will launch my Library App",
                Toast.LENGTH_SHORT).show();
    }
});


 build_bigger_btn= (Button)findViewById(R.id.btnbuilditbigger);
        build_bigger_btn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {

        Toast.makeText(getApplicationContext(), "This button will launch my Build it Bigger App",
        Toast.LENGTH_SHORT).show();
        }
        });


        xys_btn = (Button)findViewById(R.id.btnxyz);
        xys_btn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {

        Toast.makeText(getApplicationContext(), "This button will launch my XYZ reader App",
        Toast.LENGTH_SHORT).show();
        }
        });


        capstone_btn = (Button)findViewById(R.id.btncaps);
        capstone_btn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {

        Toast.makeText(getApplicationContext(), "This button will launch my Capstone App",
        Toast.LENGTH_SHORT).show();
        }
        });
        }


}








        



