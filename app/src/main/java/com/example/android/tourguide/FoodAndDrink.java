package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodAndDrink extends AppCompatActivity {
    private ArrayList<Attraction> attractions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_and_drink);

        attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.food_and_drink_one_name), getString(R.string.food_and_drink_one_address), getString(R.string.food_and_drink_one_description), R.drawable.food_and_drink_one_image));
        attractions.add(new Attraction(getString(R.string.food_and_drink_two_name), getString(R.string.food_and_drink_two_address), getString(R.string.food_and_drink_two_description), R.drawable.food_and_drink_two_image));
        attractions.add(new Attraction(getString(R.string.food_and_drink_three_name), getString(R.string.food_and_drink_three_address), getString(R.string.food_and_drink_three_description), R.drawable.food_and_drink_three_image));
        attractions.add(new Attraction(getString(R.string.food_and_drink_four_name), getString(R.string.food_and_drink_four_address), getString(R.string.food_and_drink_four_description), R.drawable.food_and_drink_four_image));
        attractions.add(new Attraction(getString(R.string.food_and_drink_five_name), getString(R.string.food_and_drink_five_address), getString(R.string.food_and_drink_five_description), R.drawable.food_and_drink_five_image));

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new AttractionAdapter(this, attractions));
    }
}
