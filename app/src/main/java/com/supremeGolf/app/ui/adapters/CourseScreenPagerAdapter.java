package com.supremeGolf.app.ui.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.supremeGolf.app.R;

/**
 * Created by sukhwinder.singh on 2/23/2017.
 */

public class CourseScreenPagerAdapter extends PagerAdapter {

    private Context mContext;

    public CourseScreenPagerAdapter(Context context){
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View convertView = inflater.inflate(R.layout.item_courses_screen_child,container,false);
        ImageView btn = (ImageView) convertView.findViewById(R.id.course_screen_favImg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("SupremeGolf","clicked>>");
            }
        });
        container.addView(convertView);
        return convertView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object view) {
        container.removeView((View)view);
    }
}
