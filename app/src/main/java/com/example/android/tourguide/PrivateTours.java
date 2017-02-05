package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PrivateTours extends AppCompatActivity {
    private ArrayList<Attraction> attractions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_parks);

        attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.private_tours_one_name), getString(R.string.private_tours_one_address), getString(R.string.private_tours_one_description), R.drawable.private_tours_one_image));
        attractions.add(new Attraction(getString(R.string.private_tours_two_name), getString(R.string.private_tours_two_address), getString(R.string.private_tours_two_description), R.drawable.private_tours_two_image));
        attractions.add(new Attraction(getString(R.string.private_tours_three_name), getString(R.string.private_tours_three_address), getString(R.string.private_tours_three_description), R.drawable.private_tours_three_image));
        attractions.add(new Attraction(getString(R.string.private_tours_four_name), getString(R.string.private_tours_four_address), getString(R.string.private_tours_four_description), R.drawable.private_tours_four_image));
        attractions.add(new Attraction(getString(R.string.private_tours_five_name), getString(R.string.private_tours_five_address), getString(R.string.private_tours_five_description), R.drawable.private_tours_five_image));

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new AttractionAdapter(this, attractions));
    }
}
