package com.advicy.lactapp.utility;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;


import com.advicy.lactapp.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CustomViewHolder> {

    private String[] mDataset;

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public CustomViewHolder(TextView v) {
            super(v);
            textView = v.findViewById(R.id.test_TextView);
        }
    }

    public RecyclerViewAdapter(String[] Dataset) {
        mDataset = Dataset;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(
                R.layout.fragment_data_recycler_view, parent, false);
        return new CustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.setText(mDataset[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
