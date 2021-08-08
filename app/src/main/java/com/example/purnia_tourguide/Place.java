package com.example.purnia_tourguide;

import android.widget.ImageView;
import android.widget.TextView;

public class Place {
    private int img;
    private String name;
    private String details;
    public Place(int i,String n,String d)
    {
        img = i;
        name = n;
        details = d;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }
}
