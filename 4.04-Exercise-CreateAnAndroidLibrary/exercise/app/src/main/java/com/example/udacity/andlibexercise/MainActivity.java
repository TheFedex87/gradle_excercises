package com.example.udacity.andlibexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.udacity.alib.JokeActivity;
import com.udacity.example.jokes.JokeSmith;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openActivity(View view) {
        Intent intent = new Intent(this, JokeActivity.class);
        JokeSmith joke = new JokeSmith();
        intent.putExtra("JOKE", joke.getJoke());

        startActivity(intent);
    }
}
