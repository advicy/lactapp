package com.advicy.lactapp.views.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.advicy.lactapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DataRecyclerViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DataRecyclerViewFragment extends Fragment {

    public DataRecyclerViewFragment() {
        // Required empty public constructor
    }


    public static DataRecyclerViewFragment newInstance() {
        return new DataRecyclerViewFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data_recycler_view, container, false);
    }
}