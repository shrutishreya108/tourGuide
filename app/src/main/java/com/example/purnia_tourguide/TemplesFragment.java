package com.example.purnia_tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TemplesFragment extends Fragment {


    public TemplesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.activity_list, container, false);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.temple_citykali,"City Kali",
                "Famous Maa Kali Mandir of Purnia city in Bihar is " +
                        "one of the landmarks in the city. Although it is " +
                        "not a big temple and is located in a small piece " +
                        "of land but due to its prime location in city, Maa" +
                        " Kali Mandir is easily accessible by the devotees. " +
                        "This temple dedicates to the deity Maa Kali which is a" +
                        " symbol of power and mankind’s support. People keep " +
                        "visiting this temple everyday throughout the year but " +
                        "ample rush is seen during the festive time when special" +
                        " annual Kali Puja is organized."));
        places.add(new Place(R.drawable.temple_panchmukhi,"Panchmukhi Mandir",
                "Panchmukhi Mandir is located right in the middle of the city. " +
                        " It is also a very famous and great temple.\n" ));
        places.add(new Place(R.drawable.temple_tatma_toli,"Durgabari",
                "One of the prominent temples in the Purnia city’s famous" +
                        " Bhatta Bazaar area, Bhatta Durgabari welcomes ample" +
                        " rush during the special festive time and particularly " +
                        "when Hindu festivals are organized. This temple welcomes " +
                        "devotees almost every day but the special occasions are " +
                        "more noticeable here when various programs are organized. " +
                        "As its name suggests, the Durgabari is known for Durga Puja " +
                        "festival."));
        places.add(new Place(R.drawable.temple_purandevi,"Puran Devi Mandir",
                "Located just 5 kilometers from the main city, the Puran " +
                        "Devi is the oldest temple of Purnia. It is believed " +
                        "that the city got its name from this temple. It was " +
                        "earlier called as Purna Aranya or complete jungle, hence" +
                        " Purnia. Goddess Puran Devi is a form of the revered " +
                        "goddess Kali"));
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),places);
        ListView listView = (ListView)root.findViewById( R.id.listView);
        listView.setAdapter(placeAdapter);
        Log.v("dekh","Temple");
        return root;
    }
}