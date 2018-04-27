package com.example.udacity.alib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();

        if (intent != null){
            String joke = intent.getStringExtra("JOKE");
            ((TextView)findViewById(R.id.joke)).setText(joke);
        }
    }
}
