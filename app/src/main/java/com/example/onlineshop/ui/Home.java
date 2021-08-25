package com.example.onlineshop.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.onlineshop.R;
import com.example.onlineshop.databinding.ActivityExploreBinding;
import com.example.onlineshop.pojo.AdapterCatogry;
import com.example.onlineshop.pojo.ModelCatogery;

import java.util.ArrayList;

public class Home extends AppCompatActivity  {

    ActivityExploreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_explore);




    }


}