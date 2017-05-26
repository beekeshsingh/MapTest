package com.example.bsingh;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by bsingh on 26/5/17.
 */

public class TabAdaptor extends FragmentPagerAdapter {

    int tabCount;
    public TabAdaptor(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MapTabActivity();
            case 1:
                return new DetailTabActivity();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
