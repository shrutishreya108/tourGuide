package com.example.purnia_tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.activity_list, container, false);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.hotel_grandimperial,"Grand Imperial",
                "Address: Bhatta Bazar, Purnia, Bihar 854301\n" +
                "Phone:095 72 252087"));
        places.add(new Place(R.drawable.hotel_7th_heaven,"7th Heaven",
                "Bhatta Bazar, \n" +
                "Khiru Chowk \n" +
                "Purnia (854301)\n"+"Call : 06454-224666"));
        places.add(new Place(R.drawable.hotel_jyotisanjay,"Jyoti Sanjay",
                "Ground Floor, Near Polytechnic Chowk, Shubhash Nagar," +
                        " PS-K-Hat, Purnea Locality, Purnea, Purnia, Bihar\n"+
                        "Call: 07360 017500"));
        places.add(new Place(R.drawable.hotel_biraj,"Biraj",
                "Chitrawani Road, Purnea Locality, Purnea, Purnia, Bihar\n" +
                "Call: 091221 53154"));

        places.add(new Place(R.drawable.hotel_runa,"Runa",
                "Girja Chowk, Purnea Sadar, Purnia, Purnea Locality, Purnea, Purnia, Bihar\n"
                        +"Call: 078086 05020"));
        places.add(new Place(R.drawable.hotel_dominos,"Dominos",
                "Hotel Shree Nayak Verdhaman Hata, NH 31, Purnea, Bihar, " +
                        "Purnea Locality, Purnia, Bihar\n" +
                        "Call: 1860 210 0000"));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);
        ListView listView = (ListView)rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);
        Log.v("dekh","Hotel");
        return rootView;
    }
}