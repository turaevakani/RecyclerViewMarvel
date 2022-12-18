package com.geektech.recyclerviewmarvel;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MarvelAdapter extends RecyclerView.Adapter<MarvelViewHolder> {

    private ArrayList<String> moviesList;

    public MarvelAdapter(ArrayList<String> moviesList) {
        this.moviesList = moviesList;
    }

    @NonNull
    @Override
    public MarvelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MarvelViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_marvel,parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MarvelViewHolder viewHolder, int position) {
        viewHolder.bind(moviesList.get(position));

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
