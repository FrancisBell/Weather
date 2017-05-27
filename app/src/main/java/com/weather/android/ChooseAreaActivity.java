package com.weather.android;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by 钟庆明 on 2017/5/26.
 * 将碎片ChooseAreaFragment加载到这个Activity中
 */

public class ChooseAreaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //用于隐藏ActionBar
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_choose_area);

        ChooseAreaFragment chooseAreaFragment = new ChooseAreaFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.choose_area_layout, chooseAreaFragment);
        transaction.commit();
    }
}
