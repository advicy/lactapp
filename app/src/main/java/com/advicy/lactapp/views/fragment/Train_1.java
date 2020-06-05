package com.advicy.lactapp.views.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.advicy.lactapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Train_1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Train_1 extends Fragment {

    public Train_1() {
        // Required empty public constructor
    }


    public static Train_1 newInstance() {
        Train_1 fragment = new Train_1();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_train_1, container, false);
    }

    public void finishTrain(View view){

    }
}