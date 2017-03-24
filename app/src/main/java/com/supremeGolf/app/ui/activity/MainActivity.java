package com.supremeGolf.app.ui.activity;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.supremeGolf.app.R;
import com.supremeGolf.app.ui.adapters.HomeListViewAdapter;
import com.supremeGolf.app.ui.fragments.HomeFragment;

public class MainActivity extends FragmentActivity implements HomeListViewAdapter.HomeListViewInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.home_fragment_container) != null){
            if (savedInstanceState != null) {
                return;
            }
            HomeFragment localSearchFragment = new HomeFragment();
            localSearchFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.home_fragment_container, localSearchFragment).commit();
        }
    }

    @Override
    public void openCalenderView() {
        startActivity(new Intent(this, CalenderViewActivity.class));
    }
}
