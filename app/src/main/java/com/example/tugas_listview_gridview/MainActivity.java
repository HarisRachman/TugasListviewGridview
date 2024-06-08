package com.example.tugas_listview_gridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterList myAdapter;
    private List<ItemList> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        itemList = new ArrayList<>();
        itemList.add(new ItemList("Manchester United",
                "Manchester United didirikan pada tahun 1878 dengan nama Newton Heath LYR Football Club, klub ini berganti nama menjadi Manchester United pada tahun 1902.",
                "https://upload.wikimedia.org/wikipedia/id/thumb/7/7a/Manchester_United_FC_crest.svg/1200px-Manchester_United_FC_crest.svg.png"));
        itemList.add(new ItemList("Real Madrid",
                "Real Madrid didirikan sekelompok mahasiswa dari Institucion Libre Enseñanza di Madrid pada tahun 1902.",
                "https://logos-world.net/wp-content/uploads/2020/06/Real-Madrid-Logo.png"));
        itemList.add(new ItemList("Inter Milan",
                "Inter Milan didirikan pada tahun 1908 setelah perpecahan dalam Klub Kriket dan Sepak Bola Milan (Yang sekarang menjadi AC Milan). Klub ini memenangkan kejuaraan pertamanya pada tahun 1910.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/FC_Internazionale_Milano_2021.svg/1024px-FC_Internazionale_Milano_2021.svg.png"));

        myAdapter = new AdapterList(itemList);
        recyclerView.setAdapter((RecyclerView.Adapter) myAdapter);
    }
}