package com.udacity.gradle.flavorspecificactivity.paid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udacity.gradle.flavorspecificactivity.R;

/**
 * Created by feder on 25/04/2018.
 */

public class JokeFragment extends Fragment {
    public JokeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_joke, container, false);
    }
}
