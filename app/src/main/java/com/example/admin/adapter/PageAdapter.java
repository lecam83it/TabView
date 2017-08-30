package com.example.admin.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.example.admin.fragment.Tab1Fragment;
import com.example.admin.fragment.Tab2Fragment;
import com.example.admin.fragment.Tab3Fragment;
import com.example.admin.fragment.Tab4Fragment;

/**
 * Created by Admin on 8/30/2017.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    public PageAdapter(FragmentManager manager){
        super(manager);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;

        switch (position) {
            case 0: frag = new Tab1Fragment();
                break;
            case 1: frag = new Tab2Fragment();
                break;
            case 2: frag = new Tab3Fragment();
                break;
            case 3: frag = new Tab4Fragment();
                break;
        }

        return frag;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String s = null;
        switch (position) {
            case 0: s = "Tab1";
                break;
            case 1: s = "Tab2";
                break;
            case 2: s = "Tab3";
                break;
            case 3: s = "Tab4";
                break;
        }
        return s;
    }
}
