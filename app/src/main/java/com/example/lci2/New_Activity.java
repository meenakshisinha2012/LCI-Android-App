package com.example.lci2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class New_Activity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    List_Adapter adapter;

    List<Document_List> documentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        documentList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        documentList.add(
                new Document_List(
                        1,
                        "C Programming Language                                                      ",
                        "148 KB ",
                        R.drawable.pdf_icon,
                        R.drawable.ic_file_download));

        documentList.add(
                new Document_List(
                        1,
                        "C++ Programming Language                                                   ",
                        "200 KB",
                        R.drawable.pdf_icon,
                        R.drawable.ic_file_download));

        documentList.add(
                new Document_List(
                        1,
                        "Python Programming Language                                        ",
                        "110 KB",
                        R.drawable.pdf_icon,
                        R.drawable.ic_file_download));

        adapter = new List_Adapter(this , documentList);
        recyclerView.setAdapter(adapter);

        toolbar = findViewById(R.id.action_bar);
        toolbar.setTitle("Back");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
