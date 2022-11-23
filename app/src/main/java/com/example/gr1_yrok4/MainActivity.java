package com.example.gr1_yrok4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gr1_yrok4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().
                    add(R.id.continentsContainer, new ContinentsFragment()).commit();
        }
    }
}