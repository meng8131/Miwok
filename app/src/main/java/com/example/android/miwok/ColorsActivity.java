package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        //set colors
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red","wetetti", R.drawable.color_red));
        words.add(new Word("green","chokokki",R.drawable.color_green));
        words.add(new Word("brown","takaakki",R.drawable.color_brown));
        words.add(new Word("gray","topoppi",R.drawable.color_gray));
        words.add(new Word("black","kululli",R.drawable.color_black));
        words.add(new Word("white","kelelli",R.drawable.color_white));
        words.add(new Word("dusty yellow","toppise",R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow","chiwiite",R.drawable.color_mustard_yellow));

        WordAdapter itemsAdpater = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_colors);
        listView.setAdapter(itemsAdpater);
    }

}
