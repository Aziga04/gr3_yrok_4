package com.example.gr1_yrok4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gr1_yrok4.databinding.ContinentsItemBinding;

import java.util.ArrayList;

public class ContinentsAdapter  extends RecyclerView.Adapter<ContinentsAdapter.ContinentsViewHolder> {
    private ArrayList<String> continentList;
    private OnItemClick onItemClick;

    public ContinentsAdapter(ArrayList<String> continentList, OnItemClick onItemClick) {
        this.continentList = continentList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentsViewHolder(ContinentsItemBinding.inflate(LayoutInflater.
                from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentsViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(continentList.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }


    class ContinentsViewHolder extends RecyclerView.ViewHolder {
        private ContinentsItemBinding binding;

        public ContinentsViewHolder(@NonNull ContinentsItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(String continent) {
            binding.tvContinentsName.setText(continent);
        }
    }
}
