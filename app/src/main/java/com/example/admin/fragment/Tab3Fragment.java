package com.example.admin.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.admin.tabview.MainActivity;
import com.example.admin.tabview.R;

import java.util.ArrayList;

/**
 * Created by Admin on 8/30/2017.
 */

public class Tab3Fragment extends Fragment{
    private ListView lvHocSinh;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_layout, container, false);

        addControls(view);
        addEvents();

        return view;
    }

    private void addEvents() {
        list.add("Tran Van A");
        list.add("Ho Thi B");
        list.add("Nguyen Cong C");
        adapter.notifyDataSetChanged();
    }

    private void addControls(View view) {
        lvHocSinh = view.findViewById(R.id.lvHocSinh);
        list = new ArrayList<>();
        list.clear();
        adapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, list);
        lvHocSinh.setAdapter(adapter);
    }

}
