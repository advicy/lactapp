package com.advicy.lactapp.views.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.advicy.lactapp.R;
import com.advicy.lactapp.viewModels.DataViewModel;
import com.advicy.lactapp.viewModels.HomeTrainViewModel;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class DataFragment extends Fragment {

    private DataViewModel mViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(DataViewModel.class);
        View root = inflater.inflate(R.layout.fragment_data, container, false);
        return root;
    }
}
