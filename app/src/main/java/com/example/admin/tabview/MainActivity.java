package com.example.admin.tabview;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.adapter.PageAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab_layout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();

    }

    private void addControls() {
        tab_layout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        FragmentManager manager = getSupportFragmentManager();

        PageAdapter adapter = new PageAdapter(manager);
        viewPager.setAdapter(adapter);

        tab_layout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_layout));
        tab_layout.setTabsFromPagerAdapter(adapter);
    }
}
