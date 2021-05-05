package com.nkocet.untitled;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CropGuideFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_crop_guide, container, false);

        ArrayList<ListModel> crops = new ArrayList<>();
        crops.add(new ListModel(R.drawable.image_1, "Picture 1"));
        // Similarly add more objects to list
        // Or fetch from database

        RecyclerView recyclerView = view.findViewById(R.id.lst_recyclerView);
        ListAdapter adapter = new ListAdapter(getContext(), crops);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return view;
    }
}