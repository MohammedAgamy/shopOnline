package com.example.onlineshop.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.onlineshop.R;
import com.example.onlineshop.databinding.ActivityMainBinding;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_main);


        splash();
    }

    private void splash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashScreen.this, AuthActivity.class));
            }
        },3000);
    }
}