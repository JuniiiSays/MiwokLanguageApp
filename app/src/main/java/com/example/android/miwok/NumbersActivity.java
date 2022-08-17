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

        //Find the rootView of Numbers activity
        LinearLayout rootView = findViewById(R.id.rootView);
        //Create a TextView programmatically
        TextView wordView = new TextView(this);
        //Show first element of the ArrayList ib that TextView
        wordView.setText(words.get(0));
        //Attach TextView with the rootView
        rootView.addView(wordView);

        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(1));
        rootView.addView(wordView2);

        TextView wordView3 = new TextView(this);
        wordView3.setText(words.get(2));
        rootView.addView(wordView3);

        TextView wordView4 = new TextView(this);
        wordView4.setText(words.get(3));
        rootView.addView(wordView4);

        TextView wordView5 = new TextView(this);
        wordView5.setText(words.get(4));
        rootView.addView(wordView5);

        TextView wordView6 = new TextView(this);
        wordView6.setText(words.get(5));
        rootView.addView(wordView6);

        TextView wordView7 = new TextView(this);
        wordView7.setText(words.get(6));
        rootView.addView(wordView7);

        TextView wordView8 = new TextView(this);
        wordView8.setText(words.get(7));
        rootView.addView(wordView8);

        TextView wordView9 = new TextView(this);
        wordView9.setText(words.get(8));
        rootView.addView(wordView9);

        TextView wordView10 = new TextView(this);
        wordView10.setText(words.get(9));
        rootView.addView(wordView10);
    }
}