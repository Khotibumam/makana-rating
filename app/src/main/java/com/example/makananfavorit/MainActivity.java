package com.example.makananfavorit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFood;
    private ArrayList<food>foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFood =findViewById(R.id.rv_food);

        foods=new ArrayList<>();
        foods.add(new food("cilok",5,2000,true));
        foods.add(new food("cimol",2,4000,false));
        foods.add(new food("piscok",5,5000,true));
        foods.add(new food("tape",1,1000,true));
        foods.add(new food("kueputu",5,7000,true));

        LinearLayoutManager Im =new LinearLayoutManager(this);
        foodAdapter adapter=new foodAdapter(this,foods);
        DividerItemDecoration divider =new DividerItemDecoration(this, Im.getOrientation());

        rvFood.setLayoutManager(Im);
        rvFood.setAdapter(adapter);
        rvFood.addItemDecoration(divider);
    }
}
