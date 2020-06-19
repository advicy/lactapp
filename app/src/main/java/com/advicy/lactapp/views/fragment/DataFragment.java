package com.advicy.lactapp.views.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.advicy.lactapp.R;
import com.advicy.lactapp.viewModels.DataViewModel;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class DataFragment extends Fragment {

    private DataViewModel mViewModel;

    public DataFragment(){

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(DataViewModel.class);

        View root = inflater.inflate(R.layout.fragment_data, container, false);
        //graph
        GraphView graph = (GraphView) root.findViewById(R.id.graphView);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0,1),
                new DataPoint(1,2),
                new DataPoint(2,5)
        });
        graph.addSeries(series);
        return root;
    }

    public void startDataActivity(View view) {

    }
}
