package com.supremeGolf.app.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.supremeGolf.app.R;
import com.supremeGolf.app.ui.adapters.HomeListViewAdapter;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
     private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private ListView mHomeListView;
    private HomeListViewAdapter mHomeListViewAdapter;
    private ArrayList<String> mArrayList;


    public HomeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View homeScreenView =  inflater.inflate(R.layout.fragment_home, container, false);
        mHomeListView = (ListView) homeScreenView.findViewById(R.id.home_fragment_list);
        createList();
        mHomeListViewAdapter = new HomeListViewAdapter(getActivity(),mArrayList,getChildFragmentManager());
        mHomeListView.setAdapter(mHomeListViewAdapter);
        return homeScreenView;
    }

    private void createList() {
        mArrayList = new ArrayList<String>();
        mArrayList.add("home screen");
        mArrayList.add("deals screen");
        mArrayList.add("courses screen");
        mArrayList.add("world screen");
    }
}
