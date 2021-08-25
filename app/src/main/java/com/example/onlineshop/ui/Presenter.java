package com.example.onlineshop.ui;

import com.example.onlineshop.R;
import com.example.onlineshop.pojo.ModelCatogery;
import com.example.onlineshop.pojo.ModelExplore;

import java.util.ArrayList;

public class Presenter {
    ShowCatInterface catInterface ,getExploreData;

    public Presenter(ShowCatInterface catInterface ,ShowCatInterface getExploreData) {
        this.catInterface = catInterface;
        this.getExploreData=getExploreData ;
    }

    //GETCATOGRY
    public ArrayList<ModelCatogery> getDataFromModel() {

        ArrayList<ModelCatogery> mList = new ArrayList<>();
        ModelCatogery m1 = new ModelCatogery("Game");
        mList.add(m1);
        ModelCatogery m2= new ModelCatogery("Game");
        mList.add(m2);
        ModelCatogery m3 = new ModelCatogery("Game");
        mList.add(m3);
        ModelCatogery m4 = new ModelCatogery("Game");
        mList.add(m4);
        ModelCatogery m5 = new ModelCatogery("Game");
        mList.add(m5);
        ModelCatogery m6 = new ModelCatogery("Game");
        mList.add(m6);

        return mList ;
    }
    public void getData()
    {
        catInterface.getCatData(getDataFromModel());
    }

    //Get Explore
    public ArrayList<ModelExplore> getDataFromExplore()
    {
        ArrayList<ModelExplore> mList = new ArrayList<>();
        ModelExplore m1 = new ModelExplore("Steve rogers" ,"Captain America","Captain America's  shield","Made in 1943 ","250,00$", R.drawable.stave,R.drawable.shell);
        mList.add(m1);
        ModelExplore m2 = new ModelExplore("Steve rogers" ,"Captain America","Captain America's  shield","Made in 1943 ","250,00$", R.drawable.stave,R.drawable.shell);
        mList.add(m2);
        ModelExplore m3 = new ModelExplore("Steve rogers" ,"Captain America","Captain America's  shield","Made in 1943 ","250,00$", R.drawable.stave,R.drawable.shell);
        mList.add(m3);
        ModelExplore m4 = new ModelExplore("Steve rogers" ,"Captain America","Captain America's  shield","Made in 1943 ","250,00$", R.drawable.stave,R.drawable.shell);
        mList.add(m4);
        ModelExplore m5 = new ModelExplore("Steve rogers" ,"Captain America","Captain America's  shield","Made in 1943 ","250,00$", R.drawable.stave,R.drawable.shell);
        mList.add(m5);
        return mList ;

    }

    public  void getDataExplore()
    {
        getExploreData.getExploreData(getDataFromExplore());
    }


}
