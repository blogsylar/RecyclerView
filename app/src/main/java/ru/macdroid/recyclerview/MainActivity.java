package ru.macdroid.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = findViewById(R.id.recycler);
        ArrayList<Model> arrayList = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(linearLayoutManager);
        Adapter adapter = new Adapter(this, arrayList);
        recycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        arrayList.add(new Model("1", "One"));
        arrayList.add(new Model("2", "Two"));
        arrayList.add(new Model("3", "Three"));
        arrayList.add(new Model("4", "Four"));
        arrayList.add(new Model("5", "Five"));
        arrayList.add(new Model("6", "Six"));
        arrayList.add(new Model("7", "Seven"));
        arrayList.add(new Model("2", "Two"));
        arrayList.add(new Model("3", "Three"));
        arrayList.add(new Model("4", "Four"));
        arrayList.add(new Model("5", "Five"));
        arrayList.add(new Model("6", "Six"));
        arrayList.add(new Model("7", "Seven"));
        arrayList.add(new Model("2", "Two"));
        arrayList.add(new Model("3", "Three"));
        arrayList.add(new Model("4", "Four"));
        arrayList.add(new Model("5", "Five"));
        arrayList.add(new Model("6", "Six"));
        arrayList.add(new Model("7", "Seven"));

    }
}
