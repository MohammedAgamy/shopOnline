package com.example.onlineshop.pojo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlineshop.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AdapterExplore extends RecyclerView.Adapter<AdapterExplore.item_explor> {

    ArrayList<ModelExplore> mList;
    Context mContext;


    public AdapterExplore(ArrayList<ModelExplore> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @NonNull
    @NotNull
    @Override
    public item_explor onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View rowItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_e, parent, false);
        item_explor item_view = new item_explor(rowItem);
        return item_view;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterExplore.item_explor holder, int position) {
        holder.name.setText(mList.get(position).getName());
        holder.nickname.setText(mList.get(position).getNickname());
        holder.cat_name.setText(mList.get(position).getCat_name());
        holder.detilse.setText(mList.get(position).getDetilse());
        holder.price.setText(mList.get(position).getPrice());
        holder.imgProfile.setImageResource(mList.get(position).getImgProfile());
        holder.imgCat.setImageResource(mList.get(position).getImgCat());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class item_explor extends RecyclerView.ViewHolder {
        TextView name, nickname, cat_name, detilse, price;
        ImageView imgProfile, imgCat, fivorat;

        public item_explor(@NonNull @NotNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_use_e);
            nickname = itemView.findViewById(R.id.name_nk_e);
            cat_name = itemView.findViewById(R.id.cat_name_e);
            detilse = itemView.findViewById(R.id.cat_det_e);
            price = itemView.findViewById(R.id.price);
            imgProfile = itemView.findViewById(R.id.profile_image_e);
            imgCat = itemView.findViewById(R.id.imageView_cat_e);


        }
    }
}
