package com.udacity.multilibrarytestproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.udacity.example.jokes.JokeSmith;
import com.udacity.example.jokes.JokeWizard;

/**
 * Created by federico.creti on 27/04/2018.
 */

public class MainActivityFragment extends Fragment {
    public MainActivityFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        JokeSmith joke = new JokeSmith();
        JokeWizard jokeWizard= new JokeWizard();

        ((TextView)view.findViewById(R.id.joke)).setText(joke.getJoke());
        ((TextView)view.findViewById(R.id.jokeWiz)).setText(jokeWizard.getJoke());

        return view;
    }
}
