package com.example.gr1_yrok4;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gr1_yrok4.databinding.CountriesItemBinding;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder> {


    private ArrayList<Country> countryList;

    public CountriesAdapter(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountriesViewHolder(CountriesItemBinding.inflate(LayoutInflater.
                from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        holder.bind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }


    class CountriesViewHolder extends RecyclerView.ViewHolder {

        private CountriesItemBinding binding;

        public CountriesViewHolder(@NonNull CountriesItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        private void bind(Country country) {
            binding.tvCountriesName.setText(country.getName());
            Glide.with(binding.ivFlag).load(country.getFlag()).into(binding.ivFlag);
        }
    }
}