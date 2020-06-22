package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_satisfied_black_24dp,
                "Happy", "Life is fun!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp,
                "Sad", "Life is sad!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_neutral_black_24dp,
                "Neutral", "Life is normal!"));
    }
}
