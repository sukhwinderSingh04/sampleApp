package com.supremeGolf.app.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.supremeGolf.app.R;


public class DealsItemFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private int mCurrentPage;

    public DealsItemFragment() {
    }

    public static final DealsItemFragment newInstance(int page, String title) {
        DealsItemFragment dealsItemFragment = new DealsItemFragment();
        Bundle data = new Bundle();
        data.putInt("current_page", page+1);
        dealsItemFragment.setArguments(data);
        return dealsItemFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            Bundle data = getArguments();
            mCurrentPage = data.getInt("current_page", 0);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View convertView = inflater.inflate(R.layout.item_deals_screen_child,container,false);
        ImageView mFavImage = (ImageView) convertView.findViewById(R.id.deals_screen_favImg);
        return convertView;
    }
}
