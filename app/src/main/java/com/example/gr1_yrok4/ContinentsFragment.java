package com.example.gr1_yrok4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.gr1_yrok4.databinding.FragmentContinentsBinding;

import java.util.ArrayList;

public class ContinentsFragment extends Fragment implements OnItemClick {
    private FragmentContinentsBinding binding;
    private ArrayList<String> continentList = new ArrayList<>();
    private ContinentsAdapter continentsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();

        continentsAdapter = new ContinentsAdapter(continentList, this);
        binding.rvContinents.setAdapter(continentsAdapter);
    }

    private void loadData() {
        continentList.add("Asia");
        continentList.add("Africa");
        continentList.add("Europe");
        continentList.add("North America");
        continentList.add("South America");
    }

    @Override
    public void onClick(int pos) {
        Toast.makeText(requireContext(), "pos" + pos, Toast.LENGTH_SHORT).show();

        Bundle bundle = new Bundle();
        bundle.putInt("key", pos);

        CountriesFragment countriesFragment = new CountriesFragment();
        countriesFragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.continentsContainer, countriesFragment).commit();
    }
}
