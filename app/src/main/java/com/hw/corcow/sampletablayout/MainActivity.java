package com.hw.corcow.sampletablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tabs;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabs = (TabLayout) findViewById(R.id.tabs);

        // Just Tab
        /*
        for (int i=0; i<10; i++)
            tabs.addTab(tabs.newTab().setText("Tab "+i));
        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, BlankFragment.newInstance(tab.getText().toString()))
                        .commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        */

        // Tab with Viewpager
        pager = (ViewPager) findViewById(R.id.pager);
        MyAdapter mAdapter = new MyAdapter(getSupportFragmentManager());
        pager.setAdapter(mAdapter);

        tabs.setupWithViewPager(pager);
//        tabs.setTabsFromPagerAdapter(mAdapter);

        tabs.removeAllTabs();
        for (int i=0; i<10; i++) {
            tabs.addTab(tabs.newTab().setText("Tab " + i));
        }
    }
}
