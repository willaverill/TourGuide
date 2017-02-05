package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Adventures extends AppCompatActivity {
    private ArrayList<Attraction> attractions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_tours);

        attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.adventures_one_name), getString(R.string.adventures_one_address), getString(R.string.adventures_one_description), R.drawable.adventures_one_image));
        attractions.add(new Attraction(getString(R.string.adventures_two_name), getString(R.string.adventures_two_address), getString(R.string.adventures_two_description), R.drawable.adventures_two_image));
        attractions.add(new Attraction(getString(R.string.adventures_three_name), getString(R.string.adventures_three_address), getString(R.string.adventures_three_description), R.drawable.adventures_three_image));
        attractions.add(new Attraction(getString(R.string.adventures_four_name), getString(R.string.adventures_four_address), getString(R.string.adventures_four_description), R.drawable.adventures_four_image));
        attractions.add(new Attraction(getString(R.string.adventures_five_name), getString(R.string.adventures_five_address), getString(R.string.adventures_five_description), R.drawable.adventures_five_image));

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new AttractionAdapter(this, attractions));
    }
}
