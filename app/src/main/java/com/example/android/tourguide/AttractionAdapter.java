package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Will on 1/25/2017.
 */

public class AttractionAdapter extends BaseAdapter {
    private ArrayList<Attraction> mAttractions;
    private Context mContext;
    private static LayoutInflater mInflater = null;

    public AttractionAdapter (Activity activity, ArrayList<Attraction> attractions) {
        mContext = activity;
        mAttractions = attractions;
        mInflater = (LayoutInflater ) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return mAttractions.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if(convertView==null) {
            view = mInflater.inflate(R.layout.list_item, null);
        }

        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(mAttractions.get(position).getName());

        TextView address = (TextView) view.findViewById(R.id.address);
        address.setText(mAttractions.get(position).getAddress());

        TextView description = (TextView) view.findViewById(R.id.description);
        description.setText(mAttractions.get(position).getDescription());

        ImageView image = (ImageView) view.findViewById(R.id.image);
        image.setImageResource(mAttractions.get(position).getImageResourceId());

        return view;
    }
}
