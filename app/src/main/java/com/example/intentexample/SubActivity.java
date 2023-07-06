package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.intentexample.databinding.ActivityMainBinding;
import com.example.intentexample.databinding.ActivitySubBinding;

public class SubActivity extends AppCompatActivity {
    private ActivitySubBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        binding.tvSub.setText(str);
    }
}