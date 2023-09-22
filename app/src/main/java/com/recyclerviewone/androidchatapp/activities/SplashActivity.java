package com.recyclerviewone.androidchatapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.recyclerviewone.androidchatapp.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {
    ActivitySplashBinding binding;
    private static final int SPLASH_SCREEN_TIME_OUT = 5000; // After completion of 2000 ms, the next activity will get started.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(LayoutInflater.from(getApplicationContext()));

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());

        new Handler().postDelayed(() -> {
            // Intent is used to switch from one activity to another.
            Intent i = new Intent(SplashActivity.this, SignInActivity.class);
            startActivity(i); // invoke the SecondActivity.
            finish(); // the current activity will get finished.
        }, SPLASH_SCREEN_TIME_OUT);
    }

}