
package com.example.retrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("taikhoan")
    @Expose
    private String taikhoan;
    @SerializedName("matkhau")
    @Expose
    private String matkhau;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("hoten")
    @Expose
    private String hoten;
    @SerializedName("imageok")
    @Expose
    private String imageok;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getImageok() {
        return imageok;
    }

    public void setImageok(String imageok) {
        this.imageok = imageok;
    }

}
