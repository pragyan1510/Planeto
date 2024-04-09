package com.example.planetsapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<planet> planetlist;

    private static myCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//adapter
        listView = findViewById(R.id.listView);
        //datasource
        planetlist  = new ArrayList<>();

        planet planet3 = new planet("Earth","1 moon",R.drawable.earth);
        planet planet1 = new planet("mercury","0 moons",R.drawable.mercury);
        planet planet2 = new planet("venus","0 moons",R.drawable.venus);
        planet planet4 = new planet("mars","2 moons",R.drawable.mars);
        planet planet5 = new planet("jupiter","79 moons",R.drawable.jupiter);
        planet planet6 = new planet("saturn","83 moons",R.drawable.saturn);
        planet planet7 = new planet("uranus","27 moons",R.drawable.uranus);
        planet planet8 = new planet("neptune","14 moons",R.drawable.neptune);
        planetlist.add(planet1);
        planetlist.add(planet2);
        planetlist.add(planet3);
        planetlist.add(planet4);
        planetlist.add(planet5);
        planetlist.add(planet6);
        planetlist.add(planet7);
        planetlist.add(planet8);

        //adapter
        adapter = new myCustomAdapter(planetlist,getApplicationContext());
        listView.setAdapter(adapter);




    }
}