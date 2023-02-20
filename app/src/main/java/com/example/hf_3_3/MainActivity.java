package com.example.hf_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private ArrayList<String> carList;
        private Adapter adapter;
        private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_car);
        loadData();
        adapter=new Adapter(carList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        carList=new ArrayList<>();
        carList.add("Baugatti");
        carList.add("mersedes");
        carList.add("BMW");
        carList.add("Tayatta");
        carList.add("Bentli");
        carList.add("Mustang");
        carList.add("Versri");
        carList.add("lamborgini");
        carList.add("Honda");
        carList.add("Hundai");
        carList.add("Gelin Wagin");
        carList.add("Audi");
        carList.add("Mazda");
        carList.add("Nexia");
        carList.add("w210 e55");
    }
}