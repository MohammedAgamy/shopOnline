package com.example.onlineshop.pojo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlineshop.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AdapterCatogry extends RecyclerView.Adapter<AdapterCatogry.item_cat> {

    ArrayList<ModelCatogery> mList;
    Context mContext;

    public AdapterCatogry(ArrayList<ModelCatogery> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @NonNull
    @NotNull
    @Override
    public item_cat onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View rowItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hed_category, parent, false);
        item_cat item_view = new item_cat(rowItem);
        return item_view;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterCatogry.item_cat holder, int position) {
        holder.cat_name.setText(mList.get(position).getCat_name());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class item_cat extends RecyclerView.ViewHolder {
        TextView cat_name;

        public item_cat(@NonNull @NotNull View itemView) {
            super(itemView);
            cat_name = itemView.findViewById(R.id.text_cat);
        }
    }
}
