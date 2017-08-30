package com.example.admin.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.admin.tabview.R;

import java.util.ArrayList;

/**
 * Created by Admin on 8/30/2017.
 */

public class Tab4Fragment extends Fragment {
    private ListView lvMonHoc;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab4_layout, container,false);

        addControls(view);
        addEvents();

        return view;
    }

    private void addEvents() {
        list.add("Toan");
        list.add("Ly");
        list.add("Hoa");
        adapter.notifyDataSetChanged();
    }

    private void addControls(View view) {
        lvMonHoc = view.findViewById(R.id.lvMonHoc);
        list = new ArrayList<>();
        adapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, list);
        lvMonHoc.setAdapter(adapter);
    }
}
