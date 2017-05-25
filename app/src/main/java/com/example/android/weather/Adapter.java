package com.example.android.weather;

import android.content.Context;
import android.provider.SyncStateContract;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by 钟庆明 on 2017/5/25.
 * 这是ViewPager的适配器
 */

public class Adapter extends FragmentPagerAdapter {

    private Context context;
    private static final String[] mTitles = {"今天", "明天", "后天"};

    public Adapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}