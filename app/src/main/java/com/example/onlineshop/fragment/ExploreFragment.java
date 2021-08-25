package com.example.onlineshop.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onlineshop.R;
import com.example.onlineshop.pojo.AdapterCatogry;
import com.example.onlineshop.pojo.AdapterExplore;
import com.example.onlineshop.pojo.ModelCatogery;
import com.example.onlineshop.pojo.ModelExplore;
import com.example.onlineshop.ui.Presenter;
import com.example.onlineshop.ui.ShowCatInterface;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ExploreFragment extends Fragment implements ShowCatInterface {
    AdapterCatogry mAdapterCat;
    Presenter presenter;
    RecyclerView mRecCat ,mRecExp;

    //DataExplore
    AdapterExplore mAdapterExplore;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iniView(view);

    }



    private void iniView(View view)
    {
        presenter = new Presenter(this,this);
        mRecCat=view.findViewById(R.id.rec_cat_e);
        mRecExp=view.findViewById(R.id.rec_list_e);

        //RecyclerCatogray
        presenter.getData();
        mRecCat.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL,false));
        mRecCat.setAdapter(mAdapterCat);

      //Explore
        presenter.getDataExplore();
        mRecExp.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL,false));
        mRecExp.setAdapter(mAdapterExplore);

    }

    @Override
    public void getCatData(ArrayList<ModelCatogery> dataFromModel) {

        mAdapterCat = new AdapterCatogry(dataFromModel,  getContext());

    }

    @Override
    public void getExploreData(ArrayList<ModelExplore> dataFromExplore) {
        mAdapterExplore=new AdapterExplore(dataFromExplore,getContext());
    }
}