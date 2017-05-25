package com.example.android.weather;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //设置TabLayout
        Adapter pagerAdapter;
        ViewPager viewPager;
        TabLayout tabLayout;
        pagerAdapter = new Adapter(getSupportFragmentManager(), this);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        pagerAdapter = new Adapter(getSupportFragmentManager(),this);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }

    @Override
    //各个action按钮的点击处理
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.search:
                Toast.makeText(this,"这是搜索",Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(this, "这是设置", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this, "这是关于", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
