package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
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

        int index = 0;
        while (index <= 9){

            //Find the rootView of Numbers activity
            LinearLayout rootView = findViewById(R.id.rootView);
            //Create a TextView programmatically
            TextView wordView = new TextView(this);
            //Show first element of the ArrayList ib that TextView
            wordView.setText(words.get(index));
            //Attach TextView with the rootView
            rootView.addView(wordView);

            index++;
        }
    }
}