package com.advicy.lactapp.views.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.advicy.lactapp.R;
import com.advicy.lactapp.viewModels.HomeTrainViewModel;
import com.advicy.lactapp.viewModels.SettingsViewModel;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class SettingsFragment extends Fragment {

    public SettingsFragment(){

    }

    private SettingsViewModel mViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(SettingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        return root;
    }
}
