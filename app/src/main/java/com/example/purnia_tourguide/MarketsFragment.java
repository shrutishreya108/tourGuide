package com.example.purnia_tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MarketsFragment extends Fragment {
;

    public MarketsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.activity_list, container, false);
        ArrayList places = new ArrayList();
        places.add(new Place(R.drawable.market_bhattabazar,"Bhatta Bazar",
                "Bhatta Bazar, located at the heart of the city " +
                        "among some its most densely populated areas," +
                        " is the main market area catering to the needs of " +
                        "the city's inhabitants. There are numerous shopping" +
                        " complexes, mini malls, departmental stores," +
                        " confectioners, groceries, studios, electronic stores " +
                        "and showrooms of some multinational and Indian companies," +
                        " including Reebok, Gini & Jony, Levi's, Killer, Koutons, " +
                        "LawmanPg3, Integrity, Charlie Outlaw, Monte Carlo, Peter England," +
                        " VIP, Titan Eye Plus, and Duke. This sector also includes good " +
                        "restaurants and hotels. Some spas and saloons have opened in Purnia" +
                        ", most recently the Jawed Habib Beauty Saloon, known across " +
                        "India."));
        places.add(new Place(R.drawable.market_linebazar,"Line Bazar",
                "Line Bazar is a prime centre for medical fraternity with" +
                        " doctors of almost every specialization. It has some" +
                        " of the best nursing homes and hospitals in the region " +
                        "of Seemanchal. Patients from all over this region ply to " +
                        "this part of the city in search of better health care " +
                        "facilities. The Line Bazar area has become the new hotspot" +
                        " with an upcoming NH road in the area. As a result, new " +
                        "restaurants, hotels, and small tourism entrepreneurs have" +
                        " appeared. The newest such addition is Hotel Panchwati" +
                        " International, which is close to Max7 hospital and Millia " +
                        "Engineering College. A multi-specialty hospital called Doctors " +
                        "and Hospital Max 7 is also planned and upgrading the medical " +
                        "facilities of the region"));
        places.add(new Place(R.drawable.market_sushantsinghchowk,
                "Sushant Singh Rajput Chowk",
                "As Purnia is the hometown of the bollywood actor who's no more " +
                        "late Sushant Singh Rajput. After his death, Ford Company " +
                        "chowk has been renamed after his name. "));
        places.add(new Place(R.drawable.v2,"V2 Mall","It is one of the best malls" +
                " of Purnia where one can find clothes at best price. Infrastructure and reasonable" +
                "price of the goods attracts many people."));
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),places);
        ListView listView = (ListView)rootView.findViewById(R.id.listView);
        listView.setAdapter(placeAdapter);
        Log.v("dekh","Market");
        return rootView;
    }
}