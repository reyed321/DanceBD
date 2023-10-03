package com.example.dancebd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    TextView profileName, profileEmail, profileUsername, profilePassword;
    TextView titleName, titleUsername;
    Button editProfile;
    BottomNavigationView bottom_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottom_nav = findViewById(R.id.bottomNavigationView);

        bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()) {

                   case R.id.home:
                       Toast.makeText(MainActivity.this,"Home", Toast.LENGTH_SHORT).show();
                       break;

                   case R.id.search:
                       Toast.makeText(MainActivity.this,"Search", Toast.LENGTH_SHORT).show();
                       break;

                   case R.id.circle:
                       Toast.makeText(MainActivity.this,"Cricle", Toast.LENGTH_SHORT).show();
                       break;

                   case R.id.profile:
                       Toast.makeText(MainActivity.this,"Profile", Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.settings:
                       Toast.makeText(MainActivity.this,"Settings", Toast.LENGTH_SHORT).show();
                       break;


               }
                return true;
            }
        });








    }
}