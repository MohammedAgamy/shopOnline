package com.example.onlineshop.ui;

import com.example.onlineshop.pojo.ModelCatogery;
import com.example.onlineshop.pojo.ModelExplore;

import java.util.ArrayList;

public interface ShowCatInterface {
     void getCatData(ArrayList<ModelCatogery> dataFromModel);
     void getExploreData(ArrayList<ModelExplore> dataFromExplore);
}
