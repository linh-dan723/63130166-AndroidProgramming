package com.example.testKT;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ActivityCau3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> items = new ArrayList<>();
        items.add("Object 1");
        items.add("Object 2");
        items.add("Object 3");

        MyAdapter adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}
