package com.example.tablayout_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.content.Context;
import android.os.Bundle;

public class MyAdapter extends FragmentPagerAdapter {


    private Context myContext;
    int totalTabs;
    private String[] tabTitles = new String[]{"স্থায়ী ঠিকানা", "বর্তমান ঠিকানা"};

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                SportFragment sportFragment = new SportFragment();
                return sportFragment;
            case 2:
                MovieFragment movieFragment = new MovieFragment();
                return movieFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
