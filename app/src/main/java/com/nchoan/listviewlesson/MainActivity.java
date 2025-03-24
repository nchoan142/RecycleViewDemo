package com.nchoan.listviewlesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    FoodModel[] foodModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateDummyData();
        setupView();
    }

    private void setupView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        FoodAdapter2 adapter = new FoodAdapter2(this, foodModels);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
//
//        ListView listView = findViewById(R.id.listView);
//        FoodAdapter adapter = new FoodAdapter(this, foodModels);
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "Clicked to item at " + position, Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    private void generateDummyData() {
        FoodModel spicyChickenPizza = new FoodModel("Spicy Chicken Pizza", "Pizza", 310.0f, R.drawable.spicy_chicken_pizza);
        FoodModel beefBurger = new FoodModel("Beef Burger", "Burger", 350.0f, R.drawable.beef_burger);
        FoodModel chickenPizza = new FoodModel("Chicken Pizza", "Pizza", 250.0f, R.drawable.chicken_pizza);
        FoodModel chickenBurger = new FoodModel("Chicken Burger", "Burger", 350.0f, R.drawable.chicken_burger);
        FoodModel fishBurger = new FoodModel("Fish Burger", "Burger", 310.0f, R.drawable.fish_burger);
        FoodModel mangoJuice = new FoodModel("Mango Juice", "Juice", 200.0f, R.drawable.mango_juice);
        foodModels = new FoodModel[]{spicyChickenPizza, beefBurger, chickenPizza, chickenBurger, fishBurger, mangoJuice, spicyChickenPizza, beefBurger, chickenPizza, chickenBurger, fishBurger, mangoJuice};
    }
}