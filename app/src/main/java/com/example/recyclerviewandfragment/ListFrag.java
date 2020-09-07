package com.example.recyclerviewandfragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class ListFrag extends Fragment {
    private   RecyclerView recyclerView;
   private RecyclerView.Adapter myAdapter;
  private   RecyclerView.LayoutManager myLayoutmanager;

      private    View view;
    public ListFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_list, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView= view.findViewById(R.id.rec);
         recyclerView.setHasFixedSize(true);
         myLayoutmanager=new LinearLayoutManager(this.getActivity());
         recyclerView.setLayoutManager(myLayoutmanager);


         myAdapter=new PersonAdapter(this.getActivity(),MyPeople.people);
         recyclerView.setAdapter(myAdapter);
    }
    public void notifydata(){
        myAdapter.notifyDataSetChanged();
    }

}
