package com.example.uc13100562.fragment;


import android.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UC13100562 on 22/05/2018.
 */

public class HotelListFragment extends ListFragment{
    List<Hotel> mHoteis;
    ArrayAdapter<Hotel> mAdapter;
    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mHoteis = carregarHoteis();
        mAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1);

    }
    public  List<Hotel> carregarHoteis(){
        List<Hotel> hotels = new ArrayList<Hotel>();
        hotels.add(new Hotel("Nome","enderço",4));
        hotels.add(new Hotel("Nome1","enderço",4));
        hotels.add(new Hotel("Nome1","enderço",4));
        return hotels;
    }
}
