package com.hw.corcow.sampletablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tacademy on 2015-10-14.
 */
public class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return BlankFragment.newInstance("Item : " + position);
    }

    @Override
    public int getCount() {
        return 10;
    }
}
