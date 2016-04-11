package com.example.tablayoutexample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by 재화 on 2016-04-11.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    Context context;

    public MyPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "TAB" + position;
    }

    @Override
    public Fragment getItem(int position) {
        // Fragment.instantiate(Context context, Fragment 이름);
        return TabFragment.instantiate(context, TabFragment.class.getName());
    }
}
