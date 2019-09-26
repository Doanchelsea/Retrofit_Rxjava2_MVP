
package com.example.retrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Get {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("tennhahang")
    @Expose
    private String tennhahang;
    @SerializedName("diachi")
    @Expose
    private String diachi;
    @SerializedName("monan")
    @Expose
    private String monan;
    @SerializedName("giatien")
    @Expose
    private String giatien;
    @SerializedName("danhgia")
    @Expose
    private String danhgia;
    @SerializedName("imgnhahang")
    @Expose
    private String imgnhahang;
    @SerializedName("mota")
    @Expose
    private String mota;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTennhahang() {
        return tennhahang;
    }

    public void setTennhahang(String tennhahang) {
        this.tennhahang = tennhahang;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMonan() {
        return monan;
    }

    public void setMonan(String monan) {
        this.monan = monan;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public String getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(String danhgia) {
        this.danhgia = danhgia;
    }

    public String getImgnhahang() {
        return imgnhahang;
    }

    public void setImgnhahang(String imgnhahang) {
        this.imgnhahang = imgnhahang;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

}
