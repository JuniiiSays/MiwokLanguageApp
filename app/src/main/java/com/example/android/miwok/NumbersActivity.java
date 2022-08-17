package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //ArrayList of String for english words
        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        //Create an Array adapter
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        //Find ListView using it's id
        GridView listView = (GridView) findViewById(R.id.list);
        //Set adapter data into LIstView
        listView.setAdapter(itemAdapter);
    }
}