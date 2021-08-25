package com.example.onlineshop.pojo;

import android.widget.ImageView;

public class ModelExplore {
    String name , nickname , cat_name , detilse , price ;
    int imgProfile ,imgCat ,fivorat;

    public ModelExplore(String name, String nickname, String cat_name, String detilse, String price, int imgProfile, int imgCat) {
        this.name = name;
        this.nickname = nickname;
        this.cat_name = cat_name;
        this.detilse = detilse;
        this.price = price;
        this.imgProfile = imgProfile;
        this.imgCat = imgCat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getDetilse() {
        return detilse;
    }

    public void setDetilse(String detilse) {
        this.detilse = detilse;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(int imgProfile) {
        this.imgProfile = imgProfile;
    }

    public int getImgCat() {
        return imgCat;
    }

    public void setImgCat(int imgCat) {
        this.imgCat = imgCat;
    }

    public int getFivorat() {
        return fivorat;
    }

    public void setFivorat(int fivorat) {
        this.fivorat = fivorat;
    }
}
