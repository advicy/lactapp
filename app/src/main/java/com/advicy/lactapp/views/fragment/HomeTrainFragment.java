package com.advicy.lactapp.views.fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.advicy.lactapp.R;
import com.advicy.lactapp.viewModels.HomeTrainViewModel;

public class HomeTrainFragment extends Fragment {

    private HomeTrainViewModel mViewModel;

    public static HomeTrainFragment newInstance() {
        return new HomeTrainFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(HomeTrainViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home_train, container, false);
        return root;
    }

}