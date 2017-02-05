package com.example.android.tourguide;

/**
 * Created by Will on 1/25/2017.
 */

public class Attraction {
    private String mName;
    private String mAddress;
    private String mDescription;
    private int mImageResourceId;

    public Attraction(String name, String address, String description, int imageResourceId) {
        mName = name;
        mAddress = address;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
