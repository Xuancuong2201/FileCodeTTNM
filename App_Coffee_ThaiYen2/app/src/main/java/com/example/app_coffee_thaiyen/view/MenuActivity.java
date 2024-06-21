package com.example.app_coffee_thaiyen.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_coffee_thaiyen.R;
import com.example.app_coffee_thaiyen.adapter.AdapterBeverage;
import com.example.app_coffee_thaiyen.model.Beverage;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {
    RecyclerView Rcv_beverage;
    AdapterBeverage adapterBeverage;
    List<Beverage> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        InitViews();
        adapterBeverage = new AdapterBeverage(list, getApplicationContext());
        Rcv_beverage.setAdapter(adapterBeverage);
        Rcv_beverage.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    private void InitViews() {
        list = Initlist();
        Rcv_beverage = findViewById(R.id.Rcv_beverage);
    }

    private List<Beverage> Initlist() {
        List<Beverage> listphu = new ArrayList<>();
        listphu.add(new Beverage(1, R.drawable.solar, "Solar", "Seed Arabica", 30, 6));
        listphu.add(new Beverage(1, R.drawable.solar, "Solar", "Seed Arabica", 30, 6));
        listphu.add(new Beverage(1, R.drawable.solar, "Solar", "Seed Arabica", 30, 6));
        listphu.add(new Beverage(1, R.drawable.solar, "Solar", "Seed Arabica", 30, 6));
        listphu.add(new Beverage(1, R.drawable.solar, "Solar", "Seed Arabica", 30, 6));
        listphu.add(new Beverage(1, R.drawable.solar, "Solar", "Seed Arabica", 30, 6));
        return listphu;
    }
}