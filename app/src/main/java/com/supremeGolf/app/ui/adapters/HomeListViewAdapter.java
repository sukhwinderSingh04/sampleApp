package com.supremeGolf.app.ui.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.supremeGolf.app.R;
import com.supremeGolf.app.ui.fragments.DealsItemFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sukhwinder.singh on 2/21/2017.
 */

public class HomeListViewAdapter extends BaseAdapter {
    public static final int VIEWTYPE_HOMESCREEN = 0;
    public static final int VIEWTYPE_DEALS = 1;
    public static final int VIEWTYPE_COURSES = 2;
    public static final int VIEWTYPE_WORLD = 3;
    private FragmentActivity mContext;
    private ArrayList<String> mItemList;
    private FragmentManager mFragmentManager;
    private HomeListViewInterface mHomeListViewInterface;

    public HomeListViewAdapter(FragmentActivity context, ArrayList<String> arrayList, FragmentManager childFragmentManager) {
        this.mContext = context;
        this.mItemList = arrayList;
        this.mFragmentManager = childFragmentManager;
        mHomeListViewInterface = (HomeListViewInterface) context;
    }

    static class ViewHolderCourses{
        ViewPager mViewPager;
        TextView mPagerTitle;
        TextView mPagerDescription;
    }

    static class ViewHolderWorld{
        ViewPager mViewPager;
        TextView mPagerTitle;
        TextView mPagerDescription;
    }

    public interface HomeListViewInterface{
        public void openCalenderView();
    }


    @Override
    public int getCount() {
        return mItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return mItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
            int itemType = getItemViewType(position);
            switch (itemType) {
                case VIEWTYPE_HOMESCREEN:
                    convertView = getHomeScreenView(position,convertView,viewGroup);
                    break;
                case VIEWTYPE_DEALS:
                    convertView = getDealsView(position,convertView,viewGroup);
                    break;
                case VIEWTYPE_COURSES:
                    convertView = getCoursesView(position,convertView,viewGroup);
                    break;
                case VIEWTYPE_WORLD:
                    convertView = getWorldScreenView(position,convertView,viewGroup);
                    break;
                default:
                    break;
            }
        return convertView;
    }

    @Override
    public int getViewTypeCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {
        if(position ==0){
            return VIEWTYPE_HOMESCREEN;
        } else if(position ==1){
            return VIEWTYPE_DEALS;
        } else if(position ==2){
            return VIEWTYPE_COURSES;
        }else{
            return VIEWTYPE_WORLD;
        }
    }

    public View getHomeScreenView(int position, View convertView, ViewGroup viewGroup) {
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_home,viewGroup,false);
            Button btn = (Button) convertView.findViewById(R.id.home_searchButton);
            LinearLayout calenderView = (LinearLayout) convertView.findViewById(R.id.home_screen_calender_layout);
            calenderView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mHomeListViewInterface.openCalenderView();
                }
            });
        }
        return convertView;
    }

    private View getWorldScreenView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolderWorld viewHolder = null;
        if(convertView == null){
            viewHolder = new ViewHolderWorld();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_world_screen,viewGroup,false);
            viewHolder.mViewPager = (ViewPager) convertView.findViewById(R.id.world_viewPager);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolderWorld) convertView.getTag();
        }
        WorldScreenPagerAdapter worldScreenPagerAdapter = new WorldScreenPagerAdapter(mContext);
        viewHolder.mViewPager.setAdapter(worldScreenPagerAdapter);
        viewHolder.mViewPager.setPadding(50, 0, 50, 0);
        viewHolder.mViewPager.setClipToPadding(false);
        viewHolder.mViewPager.setPageMargin(20);
        return convertView;
    }

    private View getDealsView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolderCourses viewHolder = null;
        if(convertView == null){
            viewHolder = new ViewHolderCourses();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_deals_screen,viewGroup,false);
            viewHolder.mViewPager = (ViewPager) convertView.findViewById(R.id.deals_viewPager);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolderCourses) convertView.getTag();
        }
        DealsScreenPagerAdapter courseScreenPagerAdapter = new DealsScreenPagerAdapter(mContext);
        viewHolder.mViewPager.setAdapter(courseScreenPagerAdapter);
        viewHolder.mViewPager.setPadding(50, 0, 50, 0);
        viewHolder.mViewPager.setClipToPadding(false);
        viewHolder.mViewPager.setPageMargin(20);
        return convertView;
    }

    private View getCoursesView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolderCourses viewHolder = null;
        if(convertView == null){
            viewHolder = new ViewHolderCourses();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_courses_screen,viewGroup,false);
            viewHolder.mViewPager = (ViewPager) convertView.findViewById(R.id.courses_viewPager);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolderCourses) convertView.getTag();
        }
        CourseScreenPagerAdapter courseScreenPagerAdapter = new CourseScreenPagerAdapter(mContext);
        viewHolder.mViewPager.setAdapter(courseScreenPagerAdapter);
        viewHolder.mViewPager.setPadding(50, 0, 50, 0);
        viewHolder.mViewPager.setClipToPadding(false);
        viewHolder.mViewPager.setPageMargin(20);
        return convertView;
    }

    private List<Fragment> getFragments(){
        List<Fragment> fList = new ArrayList<Fragment>();
        fList.add(DealsItemFragment.newInstance(0,"Fragment 1"));

        fList.add(DealsItemFragment.newInstance(1,"Fragment 2"));

        fList.add(DealsItemFragment.newInstance(2,"Fragment 3"));
        return fList;

    }
}
