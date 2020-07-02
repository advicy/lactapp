package com.advicy.lactapp.views.fragment;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.advicy.lactapp.R;
import com.advicy.lactapp.viewModels.HomeTrainViewModel;
import com.advicy.lactapp.views.activities.trainActivity;

public class HomeTrainFragment extends Fragment {

    private HomeTrainViewModel mViewModel;

    public HomeTrainFragment(){

    }

    public static HomeTrainFragment newInstance() {
        return new HomeTrainFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(HomeTrainViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home_train, container, false);
        TextView title_train_kind = root.findViewById(R.id.title_train_kind);
        title_train_kind.setText("Endurance training");
        TextView title_train_plan = root.findViewById(R.id.title_train_plan);
        title_train_plan.setText("Training plan A");
        return root;
    }

    public void startTrainActivity(View view){
        //Intent intent = new Intent(this.getContext(), trainActivity.class);
        //startActivity(intent);
    }
}