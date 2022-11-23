package com.example.gr1_yrok4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.gr1_yrok4.databinding.FragmentCountriesBinding;
import com.example.gr3_yrok4.CountriesAdapter;

import java.util.ArrayList;

public class CountriesFragment extends Fragment {


    private FragmentCountriesBinding binding;
    private ArrayList<Country> countryList = new ArrayList<>();
    private CountriesAdapter countriesAdapter;
    private int pos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountriesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int pos = getArguments().getInt("key");

        checkPos(pos);

        countriesAdapter = new CountriesAdapter(countryList);
        binding.rvCountries.setAdapter(countriesAdapter);
    }

    private void checkPos(int pos) {
        if (pos == 0) {
            loadAsia();
        }

        if (pos == 1){
            loadAfrica();
        }

        if (pos == 2) {
            loadEurope();
        }

        if (pos == 3) {
            loadNorthAmerica();
        }

        if (pos == 4){
            loadSouthAmerica();
        }
    }

    private void loadAsia() {
        countryList.add(new Country("Thailand", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Kyrgyzstan", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Kazakhstan", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Taiwan", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Mongolia", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
    }

    private void loadAfrica() {
        countryList.add(new Country("Morocco", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Ecuador", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Zimbabwe", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Yemen", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Egypt", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
    }

    private void loadEurope() {
        countryList.add(new Country("Russia", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Switzerland", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Netherlands", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Germany", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Ukraine", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
    }

    private void loadNorthAmerica() {
        countryList.add(new Country("USA", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Canada", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Mexico", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
    }

    private void loadSouthAmerica() {
        countryList.add(new Country("Brazil", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Bolivia", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Venezuela", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Argentina", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Columbia", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png"));
    }
}
