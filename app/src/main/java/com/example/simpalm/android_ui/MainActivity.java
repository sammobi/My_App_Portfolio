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


public class MainActivity extends Activity implements View.OnClickListener


{
    Button spotify_btn, scores_app_btn, library_app_btn, build_bigger_btn, xys_btn, capstone_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotify_btn = (Button) findViewById(R.id.btnspotify);
        scores_app_btn = (Button) findViewById(R.id.btnscores_app);
        library_app_btn = (Button) findViewById(R.id.btnlibrary);
        build_bigger_btn = (Button) findViewById(R.id.btnbuilditbigger);
        xys_btn = (Button) findViewById(R.id.btnxyz);
        capstone_btn = (Button) findViewById(R.id.btncaps);


        spotify_btn.setOnClickListener(this);
        scores_app_btn.setOnClickListener(this);
        library_app_btn.setOnClickListener(this);
        build_bigger_btn.setOnClickListener(this);
        xys_btn.setOnClickListener(this);
        capstone_btn.setOnClickListener(this);

    }

//
//
//
//    scores_app_btn.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//

//    }
//});
//
//
//    library_app_btn.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//

//    }
//});
//
//
//
//        build_bigger_btn.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//

//        }
//        });
//
//
//
//        xys_btn.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//

//        }
//        });
//
//
//
//        capstone_btn.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//

//        }
//        });
//        }
//


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnspotify:

                Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer App",
                        Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnscores_app:
                Toast.makeText(getApplicationContext(), "This button will launch my Scores App",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnlibrary:
                Toast.makeText(getApplicationContext(), "This button will launch my Library App",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnbuilditbigger:
                Toast.makeText(getApplicationContext(), "This button will launch my Build it Bigger App",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnxyz:
                Toast.makeText(getApplicationContext(), "This button will launch my XYZ reader App",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btncaps:
                Toast.makeText(getApplicationContext(), "This button will launch my Capstone App",
                        Toast.LENGTH_SHORT).show();
                break;


        }
    }

}






        



