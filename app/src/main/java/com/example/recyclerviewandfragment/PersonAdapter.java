package com.example.recyclerviewandfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

   private Itemclicked activity;
    public interface Itemclicked{
        void OnItemclicked(int index);
    }
   private ArrayList<Person> people;

    public PersonAdapter(Context context,ArrayList<Person> list){
        people=list;
        activity=(Itemclicked)context;
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
         TextView tv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
         tv=itemView.findViewById(R.id.tv);
         itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 activity.OnItemclicked(people.indexOf((Person)v.getTag()));
             }
         });
        }
    }

    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(people.get(position));
        holder.tv.setText(people.get(position).getName());
    }


    @Override
    public int getItemCount() {
        return people.size();
    }
}
