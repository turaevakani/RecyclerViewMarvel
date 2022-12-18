package com.geektech.recyclerviewmarvel;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MarvelViewHolder extends RecyclerView.ViewHolder {
    private TextView tvMarvel;

    public MarvelViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMarvel = itemView.findViewById(R.id.tv_marvel);

    }

    public void bind(String movies){
        tvMarvel.setText(movies);
    }
}
