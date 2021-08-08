package com.example.purnia_tourguide;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends ArrayAdapter {
    private ImageView img;
    private TextView name;
    private TextView details;
    public PlaceAdapter(@NonNull Context context, @NonNull ArrayList<Place> places) {
        super(context, 0, places);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item,parent,false);
        }
        Place currentPlace = (Place) getItem(position);
        img = (ImageView)listItemView.findViewById(R.id.image);
        name = (TextView)listItemView.findViewById(R.id.name);
        details = (TextView)listItemView.findViewById(R.id.details);
        img.setImageResource(currentPlace.getImg());
        name.setText(currentPlace.getName());
        details.setText(currentPlace.getDetails());

        return listItemView;
    }
}
