package com.example.recyclerviewandfragment;

import android.app.Application;

import java.util.ArrayList;

public class MyPeople extends Application {
   public static ArrayList<Person> people;
    @Override
    public void onCreate() {
        super.onCreate();
        people=new ArrayList<Person>();
        people.add(new Person("John","374960837"));
        people.add(new Person("sinna","393792399892083297"));
        people.add(new Person("Mongo DB","2213333322374960837"));
    }
}
