package com.example.tablayoutexample;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tabLayout) TabLayout tabLayout;
    @Bind(R.id.pager) ViewPager pager;
    MyPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setAdapterInViewPager();
        addAdapterInTabLayout();
    }

    private void setAdapterInViewPager() {
        pagerAdapter = new MyPagerAdapter(this, getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
    }

    private void addAdapterInTabLayout() {
        tabLayout.setupWithViewPager(pager);
        tabLayout.setTabsFromPagerAdapter(pagerAdapter);
    }


}
