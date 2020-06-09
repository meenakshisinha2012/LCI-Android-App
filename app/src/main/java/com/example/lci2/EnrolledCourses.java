package com.example.lci2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Menu;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class EnrolledCourses extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<Product> productList;

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enrolled_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bottomNavigation = findViewById(R.id.bottom_navigation);

        bottomNavigation.setSelectedItemId(R.id.mycourses);

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.explore:
                        startActivity(new Intent(getApplicationContext(),activity_Explore.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.mycourses:
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),activity_Account.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
        productList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        productList.add(
                new Product(
                        1,
                        "C Programming Language                                                      ",
                        "Beginner ",
                        "90% completed",
                        R.drawable.c));

        productList.add(
                new Product(
                        1,
                        "C++ Programming Language                                                   ",
                        "Intermediate",
                        "Start the course",
                        R.drawable.cplus));

        productList.add(
                new Product(
                        1,
                        "Python Programming Language                                        ",
                        "Advanced",
                        "30% completed ",
                        R.drawable.python));

        adapter = new ProductAdapter(this , productList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        String msg = " ";
        switch (item.getItemId()){
            case R.id.favorite:
                Toast.makeText(this,msg+ "Added to favorites!",Toast.LENGTH_LONG).show();
                break;
            case R.id.notification:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
