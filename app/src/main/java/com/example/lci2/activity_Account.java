package com.example.lci2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class activity_Account extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        bottomNavigation = findViewById(R.id.bottom_navigation);

        bottomNavigation.setSelectedItemId(R.id.profile);

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.explore:
                        startActivity(new Intent(getApplicationContext(),activity_Explore.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.mycourses:
                        startActivity(new Intent(getApplicationContext(), EnrolledCourses.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile:
                        return true;
                }
                return false;
            }
        });
    }
}
